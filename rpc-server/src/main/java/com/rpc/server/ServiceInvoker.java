package com.rpc.server;

import com.rpc.commen.utils.ReflectionUtils;
import com.rpc.proto.Request;

/**
 * 调用具体服务
 */
public class ServiceInvoker {

    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(service.getTarget(), service.getMethod(), request.getParameters());
    }
}
