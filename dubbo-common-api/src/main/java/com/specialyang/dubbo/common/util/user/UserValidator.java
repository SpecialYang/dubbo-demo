package com.specialyang.dubbo.common.util.user;

import com.specialyang.dubbo.common.entity.RPCRequest;
import com.specialyang.dubbo.common.entity.user.UserEntity;
import com.specialyang.dubbo.common.exception.RequestDataNotCastException;
import org.springframework.util.StringUtils;

/**
 * Created by Fan Yang in 2018/11/18 下午5:26.
 */
public class UserValidator {

    public static boolean checkUserLoginRequest(RPCRequest rpcRequest) {
        if (!(rpcRequest.getData() instanceof UserEntity)) {
            throw new RequestDataNotCastException("请求User服务的数据域对象不是UserEntity!");
        }
        UserEntity userEntity = (UserEntity) rpcRequest.getData();
        String username = userEntity.getUsername();
        String password = userEntity.getPassword();
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return false;
        }
        return true;
    }

}
