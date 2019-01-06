package com.springmvc.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor {

	//具体的controller方法执行之前执行此方法
	//比如身份认证，如果认证不通过表示当前用户没有登录，需要此方法拦截不在向下执行
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object obj) throws Exception {
		/*
		 * 登录验证:
		 * 查看是否访问的登录页面，如果不是从session中查看是否有标记，
		 * 如果没有标记返回到登录页面，有标记可以继续执行
		 */
		//获取当前请求的url
		//String url=request.getLocalAddr();两个都行
		String url=request.getRequestURI();
		
		if(url.indexOf("login.action")>0){
			//遇见return直接终止，知道你是在登录可以处理你的请求了
			return true;	
		}
		
		HttpSession session=request.getSession();
		String flag=(String) session.getAttribute("logonOK");
		if(flag==null||"".equals(flag)){
			//页面跳转
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}else{
			return true;
		}
		return false;
	}
	//具体的controller方法执行完成，但还没有做出相应时执行此方法
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}
	//具体的controller方法执行之后执行此方法
	//应用场景，统一异常处理，统一日志处理
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}
}
