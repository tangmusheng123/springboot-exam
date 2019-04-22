package com.example.exam.dao;

import com.example.exam.mapper.UserMapper;
import com.example.exam.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserInfoDao {
	@Autowired
	UserMapper userMapper;
	public User getUserInfo(String usernumber){
//		System.out.println(usernumber);多数原因为mapper的注入错误
		User user=userMapper.selectByPrimaryKey(1);
		System.out.println(user.getUserName());
		return user;
	}
}
