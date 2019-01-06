package com.springmvc.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor {

	//�����controller����ִ��֮ǰִ�д˷���
	//���������֤�������֤��ͨ����ʾ��ǰ�û�û�е�¼����Ҫ�˷������ز�������ִ��
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response,Object obj) throws Exception {
		/*
		 * ��¼��֤:
		 * �鿴�Ƿ���ʵĵ�¼ҳ�棬������Ǵ�session�в鿴�Ƿ��б�ǣ�
		 * ���û�б�Ƿ��ص���¼ҳ�棬�б�ǿ��Լ���ִ��
		 */
		//��ȡ��ǰ�����url
		//String url=request.getLocalAddr();��������
		String url=request.getRequestURI();
		
		if(url.indexOf("login.action")>0){
			//����returnֱ����ֹ��֪�������ڵ�¼���Դ������������
			return true;	
		}
		
		HttpSession session=request.getSession();
		String flag=(String) session.getAttribute("logonOK");
		if(flag==null||"".equals(flag)){
			//ҳ����ת
			response.sendRedirect(request.getContextPath()+"/login.jsp");
		}else{
			return true;
		}
		return false;
	}
	//�����controller����ִ����ɣ�����û��������Ӧʱִ�д˷���
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}
	//�����controller����ִ��֮��ִ�д˷���
	//Ӧ�ó�����ͳһ�쳣����ͳһ��־����
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}
}
