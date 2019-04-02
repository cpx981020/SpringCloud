package com.chenpeixin.cloud.feign.vo.good_vo;

import lombok.Data;

@Data
public class RateVo {

    private String id;
    private String userName;
    private Long rateTime;
    private Integer rateType;
    private String text;
    private String avatar;
}
