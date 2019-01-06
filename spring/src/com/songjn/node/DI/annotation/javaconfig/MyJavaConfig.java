package com.songjn.node.DI.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songjn
 * @date Sep 2, 2018 - 6:47:09 PM
 * @desc java类充当容器
 */
@Configuration
// 表示当前类充当spring容器，所有的bean将由这个类来创建
public class MyJavaConfig {
	@Bean(name = "school")
	public School mySchoolCreater() {
		return new School("辽工大");
	}

	// autowire = Autowire.BY_TYPE指从当前类这个容器中查找与域属性的类型具有is-a关系的Bean
	// @Bean(name = "myStudent", autowire = Autowire.BY_TYPE)
	// public Student myStudentCreater() {
	// return new Student("aimi", 33);
	// }

	// autowire = Autowire.BY_NAME指从当前类这个容器中查找与域属性同名的Bean
	@Bean(name = "myStudent", autowire = Autowire.BY_NAME)
	public Student myStudentCreater() {
		return new Student("aimi", 33);
	}

}
