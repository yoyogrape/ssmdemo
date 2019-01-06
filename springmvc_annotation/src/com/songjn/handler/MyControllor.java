package com.songjn.handler;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyControllor {

	@RequestMapping(value = { "/register.do" })
	public ModelAndView doRegister(String name, int age) {
		System.out.println("...MyControllor......register()...");
		System.out.println("name="+name);
		System.out.println("age="+age);
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("age", age);
		mv.setViewName("haha");
		return mv;
	}
	@RequestMapping(value = { "/upload.do" })
	public String upLoadFile(MultipartFile img,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println("...MyControllor......upLoadFile()...");
		String pathname="F:/imgsTest";
		String fileName=img.getOriginalFilename();
		File file=new File(pathname);
		img.transferTo(file);
		request.setAttribute("msg", "上传成功");
		return "/haha";
	}

}
