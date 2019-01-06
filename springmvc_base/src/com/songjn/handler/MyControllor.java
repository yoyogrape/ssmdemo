package com.songjn.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyControllor implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("...MyControllor......handleRequest()...");
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "ModelAndView de add");
		// mv.setViewName("/WEB-INF/jsp/haha.jsp");
		// �߼���ͼ��haha ���õ�ʱ�����ǰ��׺��Ϊ
		mv.setViewName("haha");
		return mv;
	}

}
