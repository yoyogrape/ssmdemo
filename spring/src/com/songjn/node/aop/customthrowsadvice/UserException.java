package com.songjn.node.aop.customthrowsadvice;
/**  
 * @author songjn 
 * @date Sep 3, 2018 - 11:18:49 AM  
 * @desc �Զ����쳣
 * 
 * �쳣��Ϊ���֣�
 * 1������ʱ�쳣��������Ҳ���Ա���ͨ��
 *    ��һ�� ��̳�RunTimeException����������ʱ�쳣
 * 2������ʱ�쳣�����ܲ��쳣��CheckedException����������벻ͨ��
 * 	       ��һ���м̳�Exception�����ܲ��쳣
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
