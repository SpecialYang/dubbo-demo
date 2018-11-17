package com.specialyang.dubbo.common.entity;

import java.io.Serializable;

/**
 * Created by Fan Yang in 2018/11/17 下午3:47.
 */
public class DoOrderRequest implements Serializable {

    private static final long serialVersionUID = -8194917718160499957L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
