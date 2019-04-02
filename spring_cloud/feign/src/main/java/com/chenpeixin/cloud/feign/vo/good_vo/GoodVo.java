package com.chenpeixin.cloud.feign.vo.good_vo;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class GoodVo {

    private String id = UUID.randomUUID().toString();
    private String shopId = UUID.randomUUID().toString();;
    private String name="";
    private Integer price=0;
    private Integer oldPrice=0;
    private String description="";
    private Integer sellCount=0;
    private Integer rating;
    private String info="";
    private String icon="";
    private String image="";
    private List<RateVo> ratings;
    public void setOldPrice(Integer oldPrice){
        if(oldPrice == null)
            this.oldPrice = 0;
        else
            this.oldPrice = oldPrice;
    }

    public void setRating(Integer rating){
        if(rating == null)
            this.rating = 0;
        else
            this.rating = rating;
    }
}
