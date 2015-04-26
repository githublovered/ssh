package com.zwl.web.action.tests;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zwl.service.HelloService;
@Controller
public class ShowFormAction extends ActionSupport {
	@Autowired
	private HelloService helloService;
	private String msg;
	
	public String getMsg() {
		return msg;
	}

	@Action("showForm")
	public String showForm() {
		msg = helloService.sayHello();
		return SUCCESS;
	}
}
