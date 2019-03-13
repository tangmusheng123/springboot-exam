package com.example.exam.controller;

import com.example.exam.exception.UnauthorizedException;
import com.example.exam.model.UserBean;
import com.example.exam.service.UserService;
import com.example.exam.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping("/testpost1")
    @ResponseBody
    public String testget(@RequestBody Map map) {
        System.out.println(map.get("username") + " , " + map.get("password"));
        return "123";
    }
    @PostMapping("/testpost")
    public com.example.exam.model.ResponseBean testpost(@RequestParam("username") String username,
                                                     @RequestParam("password") String password) {
        System.out.println(username);
        System.out.println(password);
        UserBean userBean = userService.getUser(username);
        if (userBean.getPassword().equals(password)) {
            return new com.example.exam.model.ResponseBean(200, "Login success", JWTUtil.sign(username, password));
        } else {
            throw new UnauthorizedException();
        }
    }
    @GetMapping("/testget")
    public com.example.exam.model.ResponseBean testget(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println(username);
        System.out.println(password);
        return new com.example.exam.model.ResponseBean(200,"test success","null");
    }
}
