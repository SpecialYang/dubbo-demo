package com.specialyang.dubbo.common.facade.order;

import com.specialyang.dubbo.common.entity.DoOrderRequest;
import com.specialyang.dubbo.common.entity.DoOrderResponse;

/**
 * Created by Fan Yang in 2018/11/17 下午3:45.
 */
public interface IOrderService {

    DoOrderResponse doOrder(DoOrderRequest request);
}
