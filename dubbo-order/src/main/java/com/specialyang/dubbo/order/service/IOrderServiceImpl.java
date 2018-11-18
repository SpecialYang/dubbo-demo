package com.specialyang.dubbo.order.service;

import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.RPCResponse;
import com.specialyang.dubbo.common.facade.order.IOrderService;
import org.springframework.stereotype.Service;

/**
 * Created by Fan Yang in 2018/11/17 下午3:45.
 */
@Service("IOrderService")
public class IOrderServiceImpl implements IOrderService {

    public RPCResponse doOrder(RPCRequest request) {
        System.out.println("曾经来过：" +  request);
        RPCResponse response = new RPCResponse();
        response.setCode("0000");
        response.setMemo("处理成功");
        return response;
    }
}
