package com.songjn.node.springtx.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.songjn.node.springtx.service.IBuyStockService;

/**
 * spring�����ʵ��
 */
public class MyTest {
	private IBuyStockService service;

	@Before
	public void before() {
		String myResource = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		service = (IBuyStockService) ac.getBean("myService");
	}
	
	@Test
	public void test() {
		service.openAccount("����", 100);
		service.openStock("vlink", 20);
	}
	
	@Test
	public void buyStock() {
		try {
			service.buyStock("����", 10, "vlink", 5);
		} catch (Exception e) {
			//�������쳣��ʱ������ִ��ʧ�ܡ�ǰû���١� 
			System.out.println("�����쳣��תǮʧ�ܡ�");
			e.printStackTrace();
		}
	}
	
}
