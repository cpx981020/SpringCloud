package com.chenpeixin.cloud.shopping_cart.dto;

import lombok.Data;

@Data
public class CartDto {

    private String id;
    private String cartId;
    private String goodId;
    private Integer count;
}
