package com.zwl.web.views.components;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.components.UIBean;
import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.apache.struts2.views.annotations.StrutsTagAttribute;

import com.zwl.vo.Page;
import com.opensymphony.xwork2.util.ValueStack;

public class Pagination extends UIBean{

	final public static String TEMPLATE = "pagination";
	 protected String pageBean;
	 
	@StrutsTagAttribute(description="获取分页对象com.zwl.vo.Page的OGNL表达式", type="com.zwl.vo.Page")
	public void setPageBean(String pageBean) {
		this.pageBean = pageBean;
	}

	/**
	 * @param stack
	 * @param request
	 * @param response
	 */
	public Pagination(ValueStack stack, HttpServletRequest request,
			HttpServletResponse response) {
		super(stack, request, response);
	}
	
	protected void evaluateExtraParams() {
        super.evaluateExtraParams();
        if (pageBean != null) {
        	//将Page对象放入到FreeMark 模板上下文中，其key为 pageBean
        	//findValue 其实就是计算OGNL表达式
            addParameter("pageBean",super.findValue(pageBean, Page.class));
            ActionMapping actionMapping= (ActionMapping) super.request.getAttribute("struts.actionMapping");
            //放入actionMapping，是为了获取到namespace与action
            addParameter("actionMapping",actionMapping);
        }

    }
	

	@Override
	protected String getDefaultTemplate() {
		return TEMPLATE;
	}

}
