package com.chenpeixin.cloud.feign.controller;

import com.chenpeixin.cloud.feign.remote.GoodRemote;
import com.chenpeixin.cloud.feign.remote.UserRemote;
import com.chenpeixin.cloud.feign.vo.good_vo.GoodAndTypeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/good")
public class UserController {
    @Autowired
    GoodRemote goodRemote;

    @RequestMapping("/get")
    public List<GoodAndTypeVo> get(){
        return goodRemote.get();
    }
}
