package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class QueryController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		//ֱ��������Ӧ������ת
		System.out.println("...QueryController........ModelAndView......");
		ModelAndView mav=new ModelAndView();
		mav.setViewName("main");
		return mav;
	}

}
