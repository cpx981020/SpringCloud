package com.chenpeixin.cloud.shopping_cart.controller;

import com.chenpeixin.cloud.shopping_cart.dto.CartDto;
import com.chenpeixin.cloud.shopping_cart.dto.GoodDto;
import com.chenpeixin.cloud.shopping_cart.mapper.CartMapper;
import com.chenpeixin.cloud.shopping_cart.service.CartService;
import com.chenpeixin.cloud.shopping_cart.vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class CartController {

    @Autowired
    CartMapper cartMapper;
    @Autowired
    CartService cartService;

    @PostMapping("/add")
    public GoodDto add(@RequestBody GoodDto good, HttpSession session){
        session.setAttribute("openId","test");
        String cartId = cartMapper.existsCart(good.getShopId(), "test");
        if(cartId == null) {
            cartId = cartService.createCart(good.getShopId(), "test");
        }
        return cartService.addCount(good,cartId);
    }

    @PostMapping("/remove")
    public GoodDto remove(@RequestBody GoodDto good, HttpSession session){
        session.setAttribute("openId","test");
        String cartId = cartMapper.existsCart(good.getShopId(), "test");
        return cartService.removeCount(good,cartId);
    }

    @GetMapping("/info")
    public List<CartVo> get(String shopId, String openId){
        String cartId = cartMapper.existsCart(shopId, openId);
        if(cartId == null)
            return null;
        return cartMapper.queryCartInfo(cartId);
    }

}
