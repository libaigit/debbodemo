package com.ithiema.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ithiema.service.HelloService;
@Service //dubbo的service
public class HelloServiceImpl implements HelloService {
    @Override
    public String SayHello(String name) {
        return "hello"+name;
    }
}
