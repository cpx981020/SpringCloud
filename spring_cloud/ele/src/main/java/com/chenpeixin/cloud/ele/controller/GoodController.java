package com.chenpeixin.cloud.ele.controller;

import com.chenpeixin.cloud.ele.dto.RatingDto;
import com.chenpeixin.cloud.ele.mapper.GoodMapper;
import com.chenpeixin.cloud.ele.mapper.RateMapper;
import com.chenpeixin.cloud.ele.vo.GoodAndTypeVo;
import com.chenpeixin.cloud.ele.vo.GoodVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class GoodController {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private RateMapper rateMapper;

    @GetMapping("/get")
    public List<GoodAndTypeVo> get(){
        return goodMapper.query();
    }

}
