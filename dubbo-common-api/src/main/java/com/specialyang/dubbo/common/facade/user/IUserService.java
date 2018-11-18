package com.specialyang.dubbo.common.facade.user;

import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.RPCResponse;

/**
 * Created by Fan Yang in 2018/11/18 下午5:12.
 */
public interface IUserService {

    RPCResponse login(RPCRequest rpcRequest);
}
