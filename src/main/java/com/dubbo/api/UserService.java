package com.dubbo.api;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public interface UserService {

	String sayHi(String name);
}