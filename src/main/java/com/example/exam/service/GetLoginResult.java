package com.example.exam.service;

import org.springframework.stereotype.Service;
@Service
public class GetLoginResult {

    public boolean getLogin(String username, String password, int type){
        System.out.println("名字:"+username+"密码："+password+"类型"+type);
        return true;
    }
}
