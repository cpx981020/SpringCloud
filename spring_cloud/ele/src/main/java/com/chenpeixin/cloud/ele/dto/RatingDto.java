package com.chenpeixin.cloud.ele.dto;

import lombok.Data;

@Data
public class RatingDto {

    private String id;
    private String shopId;
    private String goodId;
    private String userName;
    private Long rateTime;
    private Integer rateType;
    private String text;
    private String avatar;
}
