package com.guazi.dubbo.service;

import com.guazi.dubbo.model.User;

public interface SomeService {
    String hello();
    User queryUserByID(Integer id);
}
