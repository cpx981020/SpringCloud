package com.chenpeixin.cloud.shopping_cart.service;

import com.chenpeixin.cloud.shopping_cart.dto.CartDto;
import com.chenpeixin.cloud.shopping_cart.dto.GoodDto;
import com.chenpeixin.cloud.shopping_cart.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CartService {

    @Autowired
    private CartMapper cartMapper;

    public String createCart(String shopId,String openId){
        String cartId = UUID.randomUUID().toString();
        cartMapper.createCart(shopId,openId,cartId);
        return cartId;
    }

    public GoodDto addCount(GoodDto good,String cartId){
        CartDto cartInfo = new CartDto();
        cartInfo.setId(UUID.randomUUID().toString());
        cartInfo.setGoodId(good.getId());
        cartInfo.setCartId(cartId);
        cartInfo.setCount(good.getCount()==null?1:good.getCount()+1);
        Integer isExists = cartMapper.existsCartInfo(cartInfo.getCartId(), cartInfo.getGoodId());
        if(isExists == 1){
            cartMapper.updateCount(cartInfo);
        }else{
            cartMapper.addCart(cartInfo);
        }
        good.setCount(cartInfo.getCount());
        return good;
    }

    public GoodDto removeCount(GoodDto good,String cartId){
        CartDto cartInfo = new CartDto();
        cartInfo.setId(UUID.randomUUID().toString());
        cartInfo.setGoodId(good.getId());
        cartInfo.setCartId(cartId);
        cartInfo.setCount(good.getCount()-1);
        cartMapper.updateCount(cartInfo);
        good.setCount(cartInfo.getCount());
        return good;

    }
}
