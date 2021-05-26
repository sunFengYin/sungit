package com.guazi.dubbo.service.impl;

import com.guazi.dubbo.model.User;
import com.guazi.dubbo.service.SomeService;

public class SomeServiceImpl implements SomeService {


    @Override
    public String hello() {
        return "hello Dubbo";
    }

    @Override
    public User queryUserByID(Integer id) {
        User user = User
                    .bulid()
                    .setId(id)
                    .setName("list" + id);
        return user;
    }
}
