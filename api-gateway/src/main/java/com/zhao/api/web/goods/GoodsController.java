package com.zhao.api.web.goods;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhao.core.api.goods.GoodsService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Raytine on 2018/9/15.
 */
@RestController
public class GoodsController {
    @Reference
    private GoodsService goodsService;


    @GetMapping("/goods")
    public Object goods(){
        return goodsService.selectGoods();
    }
}
