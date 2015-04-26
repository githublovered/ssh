package com.zwl.web.views.jsp.tags;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

import com.zwl.web.views.components.Pagination;
import com.opensymphony.xwork2.util.ValueStack;

public class PaginationTag extends AbstractUITag {
	
	private String pageBean;

	@Override
	public Component getBean(ValueStack stack, HttpServletRequest req,
			HttpServletResponse res) {
		return new Pagination(stack,req,res);
	}

	public void setPageBean(String pageBean) {
		this.pageBean = pageBean;
		this.setTheme("bootstrap");
	}
	protected void populateParams() {
        super.populateParams();
        Pagination pg = ((Pagination) component);
        pg.setPageBean(pageBean);
    }


}
