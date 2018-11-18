package com.specialyang.dubbo.user;

import com.alibaba.dubbo.container.Main;
import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.RPCResponse;
import com.specialyang.dubbo.common.facade.order.IOrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Fan Yang in 2018/11/17 下午4:10.
 */
public class App {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext cmt = new ClassPathXmlApplicationContext("order-consumer.xml");
//
//        IOrderService iOrderService = (IOrderService) cmt.getBean("iOrderService");
//        RPCRequest rpcRequest = new RPCRequest();
//        rpcRequest.setName("specialyang");
//        RPCResponse rpcResponse = iOrderService.doOrder(rpcRequest);
//        System.out.println(rpcResponse);
        Main.main(args);
    }
}
