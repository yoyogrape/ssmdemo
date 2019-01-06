package com.songjn.node.aop.customthrowsadvice;
/**  
 * @author songjn 
 * @date Sep 3, 2018 - 11:18:49 AM  
 * @desc 自定义异常
 * 
 * 异常分为两种：
 * 1）运行时异常，不处理也可以编译通过
 *    若一个 类继承RunTimeException，就是运行时异常
 * 2）编译时异常，（受查异常）CheckedException。不处理编译不通过
 * 	       若一个列继承Exception则是受查异常
 */
public class UserException extends Exception {

	public UserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
