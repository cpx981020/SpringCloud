package com.chenpeixin.cloud.ele.mapper;
import com.chenpeixin.cloud.ele.vo.GoodAndTypeVo;
import com.chenpeixin.cloud.ele.vo.GoodVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodMapper {

    public List<GoodAndTypeVo> query();

    public List<String> idList();
}
