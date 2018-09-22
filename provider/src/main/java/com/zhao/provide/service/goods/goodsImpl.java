package com.zhao.provide.service.goods;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhao.core.api.goods.GoodsService;
import com.zhao.core.domain.goods.Goods;
import org.springframework.stereotype.Component;

/**
 * Created by Raytine on 2018/9/15.
 */
@Component
@Service(interfaceClass = GoodsService.class)
public class goodsImpl implements GoodsService {
    public Goods selectGoods() {
        Goods goods=new Goods();
        goods.setName("dasda1111");
        goods.setPrice("1234567");
        return goods;
    }
}
