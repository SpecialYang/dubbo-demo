package com.specialyang.dubbo.order.service;

import com.specialyang.dubbo.common.entity.DoOrderRequest;
import com.specialyang.dubbo.common.entity.DoOrderResponse;
import com.specialyang.dubbo.common.facade.order.IOrderService;
/**
 * Created by Fan Yang in 2018/11/17 下午3:45.
 */
public class IOrderServiceImpl implements IOrderService {


    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("曾经来过：" +  request);
        DoOrderResponse response = new DoOrderResponse();
        response.setCode("0000");
        response.setMemo("处理成功");
        return response;
    }
}
