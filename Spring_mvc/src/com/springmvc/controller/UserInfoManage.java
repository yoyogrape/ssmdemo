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
//	 * @RequestMapping�����࣬���干��·����/test��
//	 * @RequestMapping���η��������巽������·��
//	 * 
//	 * @RequestMapping(value="/test/UserInfoManage_addUser.action")
//	 * 
//	 * value:����·��
//	 * method:��ʲô����������
//	 * 
//	 */
//	@RequestMapping(value="/UserInfoManage_addUser.action",
//					method={RequestMethod.GET,RequestMethod.POST})
//	/*
//	 * @Validated:У����֮���ȡУ����
//	 * BindingResult:��Ų�����Ϣ����Ķ���
//	 * ����һǰһ�󣬳ɶԳ���
//	 * Ȼ���ڳ������ж�bindingResult.hasErrors()//�д���
//	 */
//	public ModelAndView addUser(@Validated UserInfo userInfo,
//			BindingResult bindingResult,MultipartFile user_pic) throws Exception {
//		System.out.println("...UserInfoManage...addUser()...");
//		//�ϴ��ļ�����
//		//��ȡԭʼ�ļ�������
//		String oriName=user_pic.getOriginalFilename();
//		if(user_pic!=null&&oriName!=null&&"".equals(oriName)){
//			//������
//			String newName=new Date().getTime()+oriName.substring(oriName.indexOf('.'));
//			//�����ļ��ϴ���λ��
//			String file_path="D:\\picture\\";
//			//����file����
//			File file=new File(file_path+newName);
//			//���ڴ������д�����
//			user_pic.transferTo(file);
//		}
//		
//		
//		ModelAndView mav=new ModelAndView();
//		//����̨��ӡ������Ϣ
//		if(bindingResult.hasErrors()){
//			List<ObjectError> allErrors=bindingResult.getAllErrors();
//			for(ObjectError objectError:allErrors){
//				System.out.println(objectError.getDefaultMessage());
//			}
//			//��������Ϣ����ҳ��
//			mav.addObject("allErrors",allErrors);
//			//�������»ص����ҳ��
//			mav.setViewName("/addUser");
//		}else {
//			mav.setViewName("/main");
//		}
//		return mav;
//	}
//	
//	//1.����ֵΪModelAndView����
//	@RequestMapping("/UserInfoManage_selectUser.action")
//	public ModelAndView selectUser(HttpSession session ) {
//		System.out.println("...UserInfoManage...selectUser()...");
//		System.out.println("���Ϊ��"+session.getAttribute("msg"));
//		//����service���в�ѯ����list
//		List<UserInfo> list=new ArrayList<UserInfo>();
//		UserInfo u1=new UserInfo(01,"haha","123");
//		UserInfo u2=new UserInfo(02,"xixi","123");
//		list.add(u1);
//		list.add(u2);
//		/*
//		 * ���ݹ���:addObject,
//		 * 	�൱��request.setAttribute��ֵ��ŵ�request��������
//		 * 
//		 * ҳ����ת:setViewName("/��תҳ��"),����ת��
//		 */
//		ModelAndView mav=new ModelAndView();
//		mav.addObject("userList", list);
//		
//		mav.setViewName("/selectUser");
//		return mav;
//	}
//	
//	//2.����ֵΪ�ַ����ķ���
//	@RequestMapping("/UserInfoManage_delUser.action")
//	public String delUser(Model model,Integer[] id ) {
//		System.out.println("...UserInfoManage...delUser()...");
//		/*
//		 * ��request�������д�ֵ�����ַ�ʽ
//		 * 1.model.addAttribute("msg", "ɾ���ɹ���");
//		 * 2.request.setAttribute("msg", "ɾ��ʧ�ܣ�");
//		 */
//	
//		model.addAttribute("msg", "ɾ���ɹ���");
//		
//		/*
//		 * ����ֵ������3��
//		 * 1.��תjspҳ��ʱ:return "/selectUser";
//		 * ��Ϊ�����ļ�����������suffix����׺��������ֱ����ת��selectUser.jsp��Ĭ����ת��
//		 * 2.����ת��:return "forward:/UserInfoManage_selectUser.action";
//		 * http://localhost:8080/Spring_mvc/test/
//		 * 					UserInfoManage_delUser.action
//		 * 3.�ض���:return "redirect:/editUser.jsp";
//		 * http://localhost:8080/Spring_mvc/test/
//		 * 					UserInfoManage_selectUser.action?msg=ɾ���ɹ���
//		 * 
//		 * ע�⣺�ض�������request�д�ţ�ֻ����session�д洢
//		 * session.setAttribute("msg", "ɾ��ʧ�ܣ�");
//		 */
//		
//		return "/selectUser";
//	}
//	/*
//	 * �������͵İ�
//	 * 
//	 * һ���򵥵��������Ͱ�
//	 * 1.��������ֱ��д�������Ĳ���������
//	 * 2.��������Ĭ��ֵ��@RequestParam(value="userId",defaultValue="10")Integer id
//	 * value:��ҳ���з��͵ı�Ԫ�ص�����һ��
//	 * defaultValue:�βε�Ĭ��ֵ
//	 * ʵ�ʵ��β����ƿ��Բ��ͱ��е�Ԫ������һ��
//	 * 
//	 * ��������javaBean���в����Ķ�󶨣�
//	 * 	��һ��������������漰����������Ĵ��ݣ�
//	 * 	���ʺ�ss�ü��������͵İ󶨣�����javaBean��������ʽ���в�����
//	 * 
//	 * Ҫ�󣺱�֤JavaBean���к�ҳ���б�Ԫ��ͬ�������ԣ�Ҳ���Դ����������������
//	 * 
//	 * ����ҳ���еı�Ԫ�ش��ڱ�һ��һ�����Ĳ�����
//	 * �����������������͵����ԣ�����get/set������
//	 * 	Ȼ��ҳ����ֱ�� �������.����������pro.peoid������ƥ��
//	 * 
//	 * �ġ��������͵Ĳ�����
//	 * �����Ǽ������͵ģ����ƺ�ҳ����Ҫ�ύ�ı�Ԫ�ص�����һ�£������
//	 * �磺���еĶ�ѡɾ�� checkBox��name=userId
//	 * 	     ������д�� Integer[] userId������ת���ַ���Arrays.toString(����);
//	 * 
//	 * �塣�����漰���������ݵĴ���
//	 * ����һ���µ�vo����Ȼ�������潨��ҳ������Ӧ���������з�װ��
//	 * 	���Ǳ����ڿ������н��в��
//	 * 
//	 */
//	@RequestMapping("/UserInfoManage_editUser.action")
//	public String editUser(Model model,@RequestParam(value="",defaultValue="")Integer id){
//		System.out.println("...UserInfoManage...editUser()...");
//		UserInfo u=new UserInfo(01,"haha","123");
//		model.addAttribute("userInfo", u);
//		
//		//ע�⣺ָ����ת��ʽ��ʱ��Ҫдȫ�ļ���editUser.jsp������ʡ��.jsp
//		return "forward:/editUser.jsp";
//	}
//	
//	//3.void:��������ֵ
//	public void test(HttpServletRequest request,
//						HttpServletResponse response){
//		//������servlet��д��ʽһ��
//	}
//}
///*
// * �����ķ���ֵ����1.ModelAndView 2.String  3.void
// * 
// * 1.ModelAndView:�������������Ҫ����������������ݣ�ͬʱҪ��ת��һ����ҳ��
// * 
// * 2.�ַ�������:һ������֮�󣬲�������Դ��ֻ������ת  �ض���/����ת��
// * 
// * 3.void:��������ֵ��д��������ת��ʱ����servletԭʼ��ת
// * 	request.getRequestDisPatcher/response.sendRedirect��
// * 	������Excel�ĵ���json����û��ҳ����ת��ʱ�����ʹ�ã�
// */
//
///*
// * ����������Ĭ��֧�ֵĲ�������
// * 1.model 
// * 2.HttpSession 
// * 3.HttpServletRequest  
// * 4.HttpServletResponse
// */
