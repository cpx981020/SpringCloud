package com.chenpeixin.cloud.ele.mapper;

import com.chenpeixin.cloud.ele.dto.RatingDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RateMapper {

    public void add(@Param("rate") RatingDto rate);
}
