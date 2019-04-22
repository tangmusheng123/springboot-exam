package com.example.exam.service;


import com.example.exam.dao.DataSource;
import com.example.exam.dao.UserInfoDao;
import com.example.exam.mapper.UserMapper;
import com.example.exam.model.User;
import com.example.exam.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public UserBean getUser(String username) {
        // 没有此用户直接返回null
        if (! DataSource.getData().containsKey(username))
            return null;

        UserBean user = new UserBean();
        Map<String, String> detail = DataSource.getData().get(username);

        user.setUsername(username);
        user.setPassword(detail.get("password"));
        user.setRole(detail.get("role"));
        user.setPermission(detail.get("permission"));
        return user;
    }
    public User getUserinfo(String usernumber){
        if (usernumber==""){
            return null;
        }
        System.out.println(usernumber);
//		System.out.println(usernumber);多数原因为mapper的注入错误
//        User user=userMapper.selectByPrimaryKey(1);
        User user=userMapper.selectByUserNumber(usernumber);
        System.out.println(user.getUserName());
        return user;
    }
}
