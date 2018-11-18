package com.specialyang.dubbo.user.service;

import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.RPCResponse;
import com.specialyang.dubbo.common.facade.user.IUserService;
import com.specialyang.dubbo.common.util.user.UserValidator;
import org.springframework.stereotype.Service;

/**
 * Created by Fan Yang in 2018/11/18 下午5:13.
 */
@Service("IUserService")
public class IUserServiceImpl implements IUserService {


    public RPCResponse login(RPCRequest rpcRequest) {
        //参数校验
        RPCResponse rpcResponse = new RPCResponse();
        if (UserValidator.checkUserLoginRequest(rpcRequest)) {
            rpcResponse.setCode("0000");
        } else {
            rpcResponse.setCode("0001");
        }
        return rpcResponse;
    }
}
