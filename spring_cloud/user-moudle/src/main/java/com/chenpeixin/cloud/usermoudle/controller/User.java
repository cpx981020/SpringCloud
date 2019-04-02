package com.chenpeixin.cloud.usermoudle.controller;

import com.chenpeixin.cloud.usermoudle.vo.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
public class User {

    @RequestMapping(value = "/user")
    public UserInfo get(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        userInfo.setAge(12);
        return userInfo;
    }
}
