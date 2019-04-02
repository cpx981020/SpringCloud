package com.chenpeixin.cloud.feign.hystrix;

import com.chenpeixin.cloud.feign.remote.UserRemote;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteHystric implements UserRemote {
    @Override
    public String get(String name) {
        return "该服务存在问题";
    }
}
