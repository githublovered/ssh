package com.zwl.web.action.organize.companies;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zwl.po.Company;
import com.zwl.service.CompanyService;
import com.zwl.vo.Page;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@ParentPackage(value = "ssh-default")
public class CompanyAction extends ActionSupport {
	
	@Autowired
	private CompanyService companyService;
	//默认值
	private int index=1;
	private int size=5;
	public void setIndex(int index) {
		this.index = index;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private Page<Company> page;
	public Page<Company> getPage() {
		return page;
	}

	
	@Action("list")
	public String list(){
		page = companyService.findPage(index, size);
		return SUCCESS;
	}
}
