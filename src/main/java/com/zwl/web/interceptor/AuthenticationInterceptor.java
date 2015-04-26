package com.zwl.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.zwl.Constants;

/**
 * 用户身份认证，即是否登录的判断
 * @author daina
 *
 */
public class AuthenticationInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		String currentUser=(String) ActionContext.getContext().getSession().get(Constants.CURRENT_USER);
		if(currentUser==null){
			//一旦认证失败后，需要给用户提示信息
			//而返回的视图是 redirect过去的，如果放在request中，那么提示信息无法带入到登录页面，所以这里放入到session中
			//页面中使用 <s:property value="#session.remove('not_login')"/>标签来取出提示信息。
			//它的作用就是调用了session（SessionMap）类中的remove方法，将提示消息取出来，然后删除掉它
			//注：OGNL表达式中是可以调用对象的方法的。
			ActionContext.getContext().getSession().put("not_login", "您需要登录后再访问!");
			return "signin";
		}
		return invocation.invoke();
	}

}
