package com.chenpeixin.cloud.feign.hystrix;

import com.chenpeixin.cloud.feign.remote.GoodRemote;
import com.chenpeixin.cloud.feign.vo.good_vo.GoodAndTypeVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GoodRemoteHystric implements GoodRemote {

    private final Logger log = LoggerFactory.getLogger("good");

    @Override
    public List<GoodAndTypeVo> get() {
        log.warn("获取商品列表失败");
        return null;
    }
}
