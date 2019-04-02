package com.chenpeixin.cloud.feign.controller;

import com.chenpeixin.cloud.feign.dto.cart_dto.GoodDto;
import com.chenpeixin.cloud.feign.remote.CartRemote;
import com.chenpeixin.cloud.feign.vo.cart_vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShopCartController {

    @Autowired
    private CartRemote cartRemote;

    @PostMapping("/add")
    public GoodDto add(@RequestBody GoodDto good, HttpSession session){
        return cartRemote.add(good);
    }

    @PostMapping("/remove")
    public GoodDto remove(@RequestBody GoodDto good, HttpSession session){
        return cartRemote.remove(good);
    }

    @GetMapping("/info")
    public List<CartVo> get(String shopId, String openId){
       return cartRemote.info(shopId,openId);
    }
}
