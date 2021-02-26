package com.aaron.producerfeign.feign;

import org.springframework.stereotype.Component;

/**
 * @author wuhengzhen
 * @date 2021/02/20 13:31
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {

    /**
     * 绑定 eureka-producer 服务的 /hello/ 接口
     *
     * @param name
     * @return
     */
    @Override
    public String hello(String name) {
        return "hello world";
    }
}