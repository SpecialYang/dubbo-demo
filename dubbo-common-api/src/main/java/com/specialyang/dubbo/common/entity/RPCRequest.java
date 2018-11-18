package com.specialyang.dubbo.common.entity;

import java.io.Serializable;

/**
 * Created by Fan Yang in 2018/11/17 下午3:47.
 */
public class RPCRequest<T> implements Serializable {

    private static final long serialVersionUID = -8194917718160499957L;

    private String name;

    private T data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RPCRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
