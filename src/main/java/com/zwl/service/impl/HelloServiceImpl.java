package com.zwl.service.impl;

import org.springframework.stereotype.Service;

import com.zwl.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		return "你好，张三";
	}

}
