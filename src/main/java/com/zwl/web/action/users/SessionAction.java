package com.zwl.web.action.users;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.dispatcher.SessionMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zwl.Constants;
import com.zwl.po.Users;
import com.zwl.service.UserService;
/**
 * 使用struts2 默认的package，即默认从convention-default继承而来，
 * 而convention-default这个package中没有定义auth(com.jinzhiyun4j.ssh2.web.interceptor.AuthenticationInterceptor)拦截器
 * @author zwl
 *
 */
@Controller
@Namespace("/")
public class SessionAction extends ActionSupport {	
	/**
	 * 展示登录页面
	 * @return
	 */
	@Action(value="signin",results={
			@Result(name=SUCCESS,location="home/signin.jsp")
	})
	public String signin(){
		return SUCCESS;
	}
	
	@Autowired
	private UserService userService;
	private String loginId;
    private String loginPwd;
    
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	/**
	 * 登录认证
	 * @return
	 */
	@Action(value="authen",results={
			@Result(name=SUCCESS,type="redirect",location="home/index.action"),
			@Result(name=ERROR,location="home/signin.jsp")
	})
	public String authenticate(){
		//TODO 完成认证逻辑
		if("".equals(loginId.trim()) || "".equals(loginPwd.trim()) || loginId==null || loginPwd==null ) {
			ActionContext.getContext().getSession().put("error_login","用户名或密码不能为空");
			return ERROR;
		}
		Users users = userService.findByLoginId(loginId);
		if(users==null || !loginPwd.equals(users.getLoginPwd())){
			ActionContext.getContext().getSession().put("error_login","用户名或密码错误");
			return ERROR;
		}
		ActionContext.getContext().getSession().put(Constants.CURRENT_USER, users.getName());
		return SUCCESS;
	}
	
	/**
	 * 退出登录
	 * @return
	 */
	@Action(value="signout",results={
			@Result(name=SUCCESS,type="redirectAction",location="signin")
	})
	public String signout(){
		//使session失效
		SessionMap<String,Object> session=(SessionMap<String,Object>)ActionContext.getContext().getSession();
		session.invalidate();
		//ServletActionContext.getRequest().getSession().invalidate(); 也可以使用这种方法
		return SUCCESS;
	}
}
