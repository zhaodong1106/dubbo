package com.zhao.core.domain.goods;

import java.io.Serializable;

/**
 * Created by Raytine on 2018/9/15.
 */
public class Goods implements Serializable {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
