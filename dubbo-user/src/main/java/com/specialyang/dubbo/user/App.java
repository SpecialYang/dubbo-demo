package com.specialyang.dubbo.user;

import com.specialyang.dubbo.common.entity.DoOrderRequest;
import com.specialyang.dubbo.common.entity.DoOrderResponse;
import com.specialyang.dubbo.common.facade.order.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fan Yang in 2018/11/17 下午4:10.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cmt = new ClassPathXmlApplicationContext("order-consumer.xml");

        IOrderService iOrderService = (IOrderService) cmt.getBean("iOrderService");
        DoOrderRequest doOrderRequest = new DoOrderRequest();
        doOrderRequest.setName("specialyang");
        DoOrderResponse doOrderResponse = iOrderService.doOrder(doOrderRequest);
        System.out.println(doOrderResponse);
    }
}
