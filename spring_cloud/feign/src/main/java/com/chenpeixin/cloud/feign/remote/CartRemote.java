package com.chenpeixin.cloud.feign.remote;

import com.chenpeixin.cloud.feign.dto.cart_dto.GoodDto;
import com.chenpeixin.cloud.feign.hystrix.CartRemoteHystric;
import com.chenpeixin.cloud.feign.vo.cart_vo.CartVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "cart", fallback = CartRemoteHystric.class)
public interface CartRemote {

    @PostMapping("/add")
    public GoodDto add(@RequestBody GoodDto good);

    @PostMapping("/remove")
    public GoodDto remove(@RequestBody GoodDto good);

    @GetMapping("/info")
    public List<CartVo> info(@RequestParam("shopId") String shopId, @RequestParam("openId") String openId);
}
