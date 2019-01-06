//package com.springmvc.po.bean;
//
//import javax.validation.constraints.Size;
//
//import org.hibernate.validator.constraints.NotEmpty;
//
//public class UserInfo {
//	private int id;
//	@Size(min=6,max=20,message="{user.userName.length.error}")
//	private String userName;
//	@NotEmpty(message="{user.password.empty}")
//	private String password;
//	
//	public UserInfo() {
//		super();
//	}
//
//	public UserInfo(int id, String userName, String password) {
//		super();
//		this.id = id;
//		this.userName = userName;
//		this.password = password;
//	}
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//}
