package com.zwl.web.action.home;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@ParentPackage(value = "ssh-default")
public class HomeAction extends ActionSupport {
	
	@Action("index")
	public String index(){
		return SUCCESS;
	}
}
