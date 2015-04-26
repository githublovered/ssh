package com.zwl.web.action.student;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zwl.po.Student;
import com.zwl.service.StudentService;
@Controller
@ParentPackage(value="ssh-default")
public class StudentAction extends ActionSupport {
	@Autowired
	private StudentService stuService;
	private List<Student> student;
	public List<Student> getStudent() {
		return student;
	}

	@Action("stu")
	public String list() {
		student = stuService.find(null);
		return SUCCESS;
	}
}
