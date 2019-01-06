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
//		//instanceof 判断ex是否是CustomException这个类或者是它的子类的一个实例
//		if(ex instanceof CustomException){
//			//如果该异常是系统自定义异常，直接取出来异常信息，在错误页面展示
//			customException=(CustomException) ex;
//		}else{
//			//如果该异常类型不是系统自定义异常，构造一个自定义的异常类型（信息为“未知错误”）
//			customException=new CustomException("未知错误！");
//		}
//		ModelAndView mav=new ModelAndView();
//		//将错误信息放到作用域中，进行回显
//		mav.addObject("errorMessage",customException.getMessage());
//		//最后跳转到自定义的错误页面
//		mav.setViewName("/error");
//		return mav;
//	}
//}
