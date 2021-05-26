package com.guazi.dubbo.service.impl;

import com.guazi.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public String hello(String msg) {
        return "hello"+msg;
    }
}
