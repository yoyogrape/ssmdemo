package com.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginHandler {
	@RequestMapping("test/LoginHandler_login")
	public String login(HttpSession session) throws Exception {
		System.out.println("...LoginHandler...login...");
		//��session�д������loginOK��Ϊ��¼���
		session.setAttribute("loginOK", "login");
		return "/main";
	}
}


































