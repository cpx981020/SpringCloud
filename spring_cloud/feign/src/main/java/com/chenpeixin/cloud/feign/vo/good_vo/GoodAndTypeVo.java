package com.chenpeixin.cloud.feign.vo.good_vo;
import lombok.Data;

import java.util.List;

@Data
public class GoodAndTypeVo {
    private String name;
    private String typeId;
    private List<GoodVo> foods;
}
