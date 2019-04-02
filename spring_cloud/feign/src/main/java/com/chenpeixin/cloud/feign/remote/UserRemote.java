package com.chenpeixin.cloud.feign.remote;

import com.chenpeixin.cloud.feign.hystrix.UserRemoteHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-user",fallback = UserRemoteHystric.class)
public interface UserRemote {

    @RequestMapping(value = "/user")
    String get(@RequestParam("name") String name);
}
