package com.specialyang.dubbo.common.facade.order;

import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.RPCResponse;

/**
 * Created by Fan Yang in 2018/11/17 下午3:45.
 */
public interface IOrderService {

    RPCResponse doOrder(RPCRequest request);
}
