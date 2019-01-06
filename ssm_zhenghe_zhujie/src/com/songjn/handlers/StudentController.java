package com.songjn.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.songjn.po.Student;
import com.songjn.service.IStudentSerrvice;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@Autowired
	private IStudentSerrvice service;
	@RequestMapping("/reg.do")
	public String doReg(String name,int age,HttpServletRequest request){
		System.out.println("...StudentController...regStudnet()...");
		Student student=new Student(name, age);
		service.addStudent(student);
		request.setAttribute("msg", "×¢²á³É¹¦£¡");
		return "/welcome";
	}
}
