package com.chenpeixin.cloud.feign.remote;

import com.chenpeixin.cloud.feign.hystrix.GoodRemoteHystric;
import com.chenpeixin.cloud.feign.vo.good_vo.GoodAndTypeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "good",fallback = GoodRemoteHystric.class)
public interface GoodRemote {

    @GetMapping("/get")
    public List<GoodAndTypeVo> get();
}
