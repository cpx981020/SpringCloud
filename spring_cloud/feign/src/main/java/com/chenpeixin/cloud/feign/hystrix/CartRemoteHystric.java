package com.chenpeixin.cloud.feign.hystrix;

import com.chenpeixin.cloud.feign.dto.cart_dto.GoodDto;
import com.chenpeixin.cloud.feign.remote.CartRemote;
import com.chenpeixin.cloud.feign.vo.cart_vo.CartVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CartRemoteHystric implements CartRemote {

    private final Logger log = LoggerFactory.getLogger("cartLog");

    @Override
    public GoodDto add(GoodDto good) {
        log.warn("添加购物车故障");
        return null;
    }

    @Override
    public GoodDto remove(GoodDto good) {
        log.warn("移除购物车故障");
        return null;
    }

    @Override
    public List<CartVo> info(String shopId, String openId) {
        log.warn("获取购物车信息故障");
        return null;
    }
}
