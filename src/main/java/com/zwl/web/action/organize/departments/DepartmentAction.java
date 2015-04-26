package com.zwl.web.action.organize.departments;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

@Controller
@ParentPackage(value = "ssh-default")
public class DepartmentAction extends ActionSupport {
	
	@Action("list")
	public String list(){
		return SUCCESS;
	}
}
