//package com.springmvc.utils;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ModelAndView;
//
//
//public class CustomExceptionResolver implements HandlerExceptionResolver {
//
//	public ModelAndView resolveException(HttpServletRequest request,
//			HttpServletResponse response, Object obj, Exception ex) {
//		CustomException customException =null;
//		//instanceof �ж�ex�Ƿ���CustomException�������������������һ��ʵ��
//		if(ex instanceof CustomException){
//			//������쳣��ϵͳ�Զ����쳣��ֱ��ȡ�����쳣��Ϣ���ڴ���ҳ��չʾ
//			customException=(CustomException) ex;
//		}else{
//			//������쳣���Ͳ���ϵͳ�Զ����쳣������һ���Զ�����쳣���ͣ���ϢΪ��δ֪���󡱣�
//			customException=new CustomException("δ֪����");
//		}
//		ModelAndView mav=new ModelAndView();
//		//��������Ϣ�ŵ��������У����л���
//		mav.addObject("errorMessage",customException.getMessage());
//		//�����ת���Զ���Ĵ���ҳ��
//		mav.setViewName("/error");
//		return mav;
//	}
//}
