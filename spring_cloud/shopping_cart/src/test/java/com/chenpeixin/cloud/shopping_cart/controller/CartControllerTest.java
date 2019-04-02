package com.chenpeixin.cloud.shopping_cart.controller;

import com.chenpeixin.cloud.shopping_cart.dto.CartDto;
import com.chenpeixin.cloud.shopping_cart.dto.GoodDto;
import com.chenpeixin.cloud.shopping_cart.mapper.CartMapper;
import com.chenpeixin.cloud.shopping_cart.service.CartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CartControllerTest {
    @Autowired
    CartMapper cartMapper;
    @Autowired
    CartService cartService;

    @Test
    public void test(){
//        CartDto cartDto = new CartDto();
//        cartDto.setCartId("01c13f14-f1f8-41f0-891c-cd35af107jf2");
//        cartDto.setGoodCount(5);
//        cartDto.setGoodId("01c13f14-f1f8-41f0-891c-cd35af107af3");
//        cartDto.setId("01c13f14-fdf8-41f0-891c-cd35af107af3");
//        cartMapper.addCart(cartDto);
        Integer integer = cartMapper.existsCartInfo("01c13f14-f1f8-41f0-891c-cd35af107jf2", "01c13f14-f1f8-41f0-891c-cd35af107af3");
        System.out.println(integer);
        GoodDto goodDto = new GoodDto();
        goodDto.setCount(9);
        goodDto.setId("39ec43ad-8ed7-476d-959f-d38b804f1498");
        cartService.addCount(goodDto,"01c13f14-f1f8-41f0-891c-cd35af107jf2");

    }
}