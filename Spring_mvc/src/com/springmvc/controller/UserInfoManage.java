//package com.springmvc.controller;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.ObjectError;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.springmvc.po.bean.UserInfo;
//
//@Controller
//@RequestMapping("/test")
//public class UserInfoManage {
//	/*
//	 * @RequestMapping修饰类，定义共有路径“/test”
//	 * @RequestMapping修饰方法，定义方法访问路径
//	 * 
//	 * @RequestMapping(value="/test/UserInfoManage_addUser.action")
//	 * 
//	 * value:访问路径
//	 * method:以什么方法接请求
//	 * 
//	 */
//	@RequestMapping(value="/UserInfoManage_addUser.action",
//					method={RequestMethod.GET,RequestMethod.POST})
//	/*
//	 * @Validated:校验完之后获取校验结果
//	 * BindingResult:存放捕获信息结果的对象
//	 * 两者一前一后，成对出现
//	 * 然后在程序中判断bindingResult.hasErrors()//有错误
//	 */
//	public ModelAndView addUser(@Validated UserInfo userInfo,
//			BindingResult bindingResult,MultipartFile user_pic) throws Exception {
//		System.out.println("...UserInfoManage...addUser()...");
//		//上传文件代码
//		//获取原始文件的名称
//		String oriName=user_pic.getOriginalFilename();
//		if(user_pic!=null&&oriName!=null&&"".equals(oriName)){
//			//重命名
//			String newName=new Date().getTime()+oriName.substring(oriName.indexOf('.'));
//			//定义文件上传的位置
//			String file_path="D:\\picture\\";
//			//构建file对象
//			File file=new File(file_path+newName);
//			//将内存的数据写入磁盘
//			user_pic.transferTo(file);
//		}
//		
//		
//		ModelAndView mav=new ModelAndView();
//		//控制台打印错误信息
//		if(bindingResult.hasErrors()){
//			List<ObjectError> allErrors=bindingResult.getAllErrors();
//			for(ObjectError objectError:allErrors){
//				System.out.println(objectError.getDefaultMessage());
//			}
//			//将错误信息传到页面
//			mav.addObject("allErrors",allErrors);
//			//出错重新回到添加页面
//			mav.setViewName("/addUser");
//		}else {
//			mav.setViewName("/main");
//		}
//		return mav;
//	}
//	
//	//1.返回值为ModelAndView方法
//	@RequestMapping("/UserInfoManage_selectUser.action")
//	public ModelAndView selectUser(HttpSession session ) {
//		System.out.println("...UserInfoManage...selectUser()...");
//		System.out.println("结果为："+session.getAttribute("msg"));
//		//调用service进行查询生成list
//		List<UserInfo> list=new ArrayList<UserInfo>();
//		UserInfo u1=new UserInfo(01,"haha","123");
//		UserInfo u2=new UserInfo(02,"xixi","123");
//		list.add(u1);
//		list.add(u2);
//		/*
//		 * 数据共享:addObject,
//		 * 	相当于request.setAttribute将值存放到request作用域中
//		 * 
//		 * 页面跳转:setViewName("/跳转页面"),请求转发
//		 */
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userList", list);
//		
//		mav.setViewName("/selectUser");
//		return mav;
//	}
//	
//	//2.返回值为字符串的方法
//	@RequestMapping("/UserInfoManage_delUser.action")
//	public String delUser(Model model,Integer[] id ) {
//		System.out.println("...UserInfoManage...delUser()...");
//		/*
//		 * 向request作用域中存值的两种方式
//		 * 1.model.addAttribute("msg", "删除成功！");
//		 * 2.request.setAttribute("msg", "删除失败！");
//		 */
//	
//		model.addAttribute("msg", "删除成功！");
//		
//		/*
//		 * 返回值类型有3种
//		 * 1.跳转jsp页面时:return "/selectUser";
//		 * 因为核心文件中配置属性suffix（后缀），所以直接跳转到selectUser.jsp，默请求转发
//		 * 2.请求转发:return "forward:/UserInfoManage_selectUser.action";
//		 * http://localhost:8080/Spring_mvc/test/
//		 * 					UserInfoManage_delUser.action
//		 * 3.重定向:return "redirect:/editUser.jsp";
//		 * http://localhost:8080/Spring_mvc/test/
//		 * 					UserInfoManage_selectUser.action?msg=删除成功！
//		 * 
//		 * 注意：重定向不能在request中存放，只能在session中存储
//		 * session.setAttribute("msg", "删除失败！");
//		 */
//		
//		return "/selectUser";
//	}
//	/*
//	 * 参数类型的绑定
//	 * 
//	 * 一。简单的数据类型绑定
//	 * 1.参数里面直接写传进来的参数的名字
//	 * 2.参数增加默认值：@RequestParam(value="userId",defaultValue="10")Integer id
//	 * value:和页面中发送的表单元素的名称一致
//	 * defaultValue:形参的默认值
//	 * 实际的形参名称可以不和表单中的元素名称一致
//	 * 
//	 * 二。利用javaBean进行参数的额绑定：
//	 * 	当一次请求处理过程中涉及到多个参数的传递，
//	 * 	不适合ss用简单数据类型的绑定，采用javaBean类对象的形式进行参数绑定
//	 * 
//	 * 要求：保证JavaBean中有和页面中表单元素同名的属性，也可以存在其他多余的属性
//	 * 
//	 * 三。页面中的表单元素存在表一对一关联的参数绑定
//	 * 在类中声明其他类型的属性，生成get/set方法，
//	 * 	然后页面中直接 ‘类别名.属性名’（pro.peoid）进行匹配
//	 * 
//	 * 四。集合类型的参数绑定
//	 * 参数是集合类型的，名称和页面中要提交的表单元素的名字一致（多个）
//	 * 如：表单中的多选删除 checkBox中name=userId
//	 * 	     参数的写法 Integer[] userId，数组转换字符串Arrays.toString(数组);
//	 * 
//	 * 五。表单中涉及多个表的数据的处理
//	 * 生成一个新的vo包，然后在里面建立页面所对应的类来进行封装，
//	 * 	但是必须在控制器中进行拆分
//	 * 
//	 */
//	@RequestMapping("/UserInfoManage_editUser.action")
//	public String editUser(Model model,@RequestParam(value="",defaultValue="")Integer id){
//		System.out.println("...UserInfoManage...editUser()...");
//		UserInfo u=new UserInfo(01,"haha","123");
//		model.addAttribute("userInfo", u);
//		
//		//注意：指定跳转方式的时候要写全文件名editUser.jsp，不能省略.jsp
//		return "forward:/editUser.jsp";
//	}
//	
//	//3.void:方法返回值
//	public void test(HttpServletRequest request,
//						HttpServletResponse response){
//		//程序与servlet书写方式一样
//	}
//}
///*
// * 方法的返回值类型1.ModelAndView 2.String  3.void
// * 
// * 1.ModelAndView:当请求结束后，需要往作用域中添加数据，同时要跳转到一个新页面
// * 
// * 2.字符串类型:一次请求之后，不共享资源，只想做跳转  重定向/请求转发
// * 
// * 3.void:方法返回值不写，进行跳转的时候用servlet原始跳转
// * 	request.getRequestDisPatcher/response.sendRedirect，
// * 	在生成Excel文档和json串的没有页面跳转的时候可以使用；
// */
//
///*
// * 控制器方法默认支持的参数类型
// * 1.model 
// * 2.HttpSession 
// * 3.HttpServletRequest  
// * 4.HttpServletResponse
// */
