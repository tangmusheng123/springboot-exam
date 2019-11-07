package com.example.exam.controller;

import com.example.exam.exception.UnauthorizedException;
import com.example.exam.model.User;
import com.example.exam.model.UserBean;
import com.example.exam.service.UserService;
import com.example.exam.util.JWTUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class WebController {

    private static final Logger LOGGER = LogManager.getLogger(WebController.class);

    private UserService userService;

    @Autowired
    public void setService(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public com.example.exam.model.ResponseBean login(@RequestParam("username") String username,
                                                  @RequestParam("password") String password) {
        System.out.println(username);
        User userBean = userService.getUserinfo(username);
        if (userBean.getUserPassword().equals(password)) {
            Map<String, String> data = new HashMap<>();
            data.put("token", JWTUtil.sign(username, password));
            data.put("usertype", userBean.getUserRole());
            return new com.example.exam.model.ResponseBean(200, "Login success", data);
        } else {
            throw new UnauthorizedException();
        }
    }
    @CrossOrigin
    @GetMapping("/test")
    public String test(@RequestParam("username") String username,
                       @RequestParam("password") String password){
        System.out.println("123");
        return "123";
    }
    @GetMapping("/article")
    public com.example.exam.model.ResponseBean article() {
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            return new com.example.exam.model.ResponseBean(200, "You are already logged in", null);
        } else {
            return new com.example.exam.model.ResponseBean(200, "You are guest", null);
        }
    }

    @GetMapping("/require_auth")
    @RequiresAuthentication
    public com.example.exam.model.ResponseBean requireAuth() {
        return new com.example.exam.model.ResponseBean(200, "You are authenticated", null);
    }
    @GetMapping("/require_teacher")
    @RequiresRoles("teacher")
    public com.example.exam.model.ResponseBean requireTeacher() {
        return new com.example.exam.model.ResponseBean(200, "You are authenticated", null);
    }

    @GetMapping("/require_role")
    @RequiresRoles("admin")
    public com.example.exam.model.ResponseBean requireRole() {
        return new com.example.exam.model.ResponseBean(200, "You are visiting require_role", null);
    }

    @GetMapping("/require_permission")
    @RequiresRoles("teacher")
    public com.example.exam.model.ResponseBean requirePermission() {
        return new com.example.exam.model.ResponseBean(200, "You are visiting permission require edit,view", null);
    }

    @RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public com.example.exam.model.ResponseBean unauthorized() {
        return new com.example.exam.model.ResponseBean(401, "Unauthorized", null);
    }
}
