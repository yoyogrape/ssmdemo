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
	public String regStudnet(HttpServletRequest request){
		System.out.println("...StudentController...regStudnet()...");
		String nameString=request.getParameter("name");
		String ageString=request.getParameter("age");
		Integer ageInteger=Integer.parseInt(ageString);
		Student student=new Student(nameString, ageInteger);
		System.out.println("name="+nameString+"age="+ageString);
		service.addStudent(student);
		return "";
	}
}
