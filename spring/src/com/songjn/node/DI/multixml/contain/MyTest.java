package com.songjn.node.DI.multixml.contain;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入
 * 多个配置文件（xml），包含关系
 * 注意：路径将【.】换成【/】
 */
public class MyTest {
	@Test
	public void test() {
		//spring-base.xml这个是总的配置文件，命名不能喝子的一样格式。spring-*的时候会将自己包含进去
		//spring-*:通配符
		String myResource = "com/songjn/node/DI/multixml/contain/applicationContext.xml";
		//String myResource = "com/songjn/node/DI/multixml/contain/spring-base.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		Student student1=(Student) ac.getBean("myStudent");
		System.out.println(student1);
		Teacher teacher=(Teacher) ac.getBean("myTeacher");
		System.out.println(teacher);
	}
}
