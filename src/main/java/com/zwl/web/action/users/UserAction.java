package com.zwl.web.action.users;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zwl.po.Users;
import com.zwl.service.UserService;
@Controller
@ParentPackage(value="ssh-default")
public class UserAction extends ActionSupport {
	@Autowired
	private UserService userService;
	private List<Users> users;
	public List<Users> getUsers() {
		return users;
	}
	@Action("list")
	public String list() {
		users = userService.find(null);
		return SUCCESS;
	}
	
}
