package com.chenpeixin.cloud.shopping_cart.mapper;

import com.chenpeixin.cloud.shopping_cart.dto.CartDto;
import com.chenpeixin.cloud.shopping_cart.vo.CartVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CartMapper {

    public String existsCart(@Param("shopId") String shopId,@Param("openId") String openId);

    public void createCart(@Param("shopId")String shopId,@Param("openId")String openId,@Param("id")String cartId);

    public void updateCount(CartDto cart);

    public void addCart(CartDto cart);

    public Integer existsCartInfo(@Param("cartId")String cartId,@Param("goodId")String goodId);

    public List<CartVo> queryCartInfo(@Param("cartId") String cartId);
}
