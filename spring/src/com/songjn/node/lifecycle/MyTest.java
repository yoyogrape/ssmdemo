package com.songjn.node.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean 的生命始末
 * 生命结束方法（doEnd）的执行需要两个条件：  
 * 1、bean是单例 
 * 2、需要手动关闭容器
 */
public class MyTest {
	@Test
	public void test06() {
		String myResource = "com/songjn/node/lifecycle/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(myResource);
		ISomeService service = (ISomeService) ac.getBean("myService");
		service.doSome();
		// 手动关闭容器，才能调用doEnd方法。
		((ClassPathXmlApplicationContext) ac).close();
	}
	// step1：执行构造方法
	// step2：执行setter方法
	// step3：执行BeanNameAware接口的setBeanName方法。获取bean Id=myService
	// step4：执行BeanFactoryAware接口的setBeanFactory方法。获取beanFactory容器
	// step5：执行bean后处理器的postProcessBeforeInitialization方法，bean初始化完毕之前执行。
	// step6：执行InitializingBean接口的afterPropertiesSet方法。bean初始化化完毕了。
	// step7：生命始末的开始，在初始化完毕之后，方法执行之前执行。
	// step8：执行bean后处理器的postProcessAfterInitialization方法，bean初始化完毕之后执行。
	// step9：执行业务方法doSome---历史使命
	// step10：执行DisposableBean接口的destroy方法。销毁之前。
	// step11：生命始末的末尾，在销毁之前执行---最后的遗言
}
