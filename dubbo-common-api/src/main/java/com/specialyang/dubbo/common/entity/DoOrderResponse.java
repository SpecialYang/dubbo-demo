package com.specialyang.dubbo.common.entity;

import java.io.Serializable;

/**
 * Created by Fan Yang in 2018/11/17 下午3:47.
 */
public class DoOrderResponse implements Serializable {

    private static final long serialVersionUID = -7686023500499677642L;

    private Object data;

    private String code;

    private String memo;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
