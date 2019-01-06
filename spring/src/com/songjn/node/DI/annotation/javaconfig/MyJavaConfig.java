package com.songjn.node.DI.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songjn
 * @date Sep 2, 2018 - 6:47:09 PM
 * @desc java��䵱����
 */
@Configuration
// ��ʾ��ǰ��䵱spring���������е�bean���������������
public class MyJavaConfig {
	@Bean(name = "school")
	public School mySchoolCreater() {
		return new School("�ɹ���");
	}

	// autowire = Autowire.BY_TYPEָ�ӵ�ǰ����������в����������Ե����;���is-a��ϵ��Bean
	// @Bean(name = "myStudent", autowire = Autowire.BY_TYPE)
	// public Student myStudentCreater() {
	// return new Student("aimi", 33);
	// }

	// autowire = Autowire.BY_NAMEָ�ӵ�ǰ����������в�����������ͬ����Bean
	@Bean(name = "myStudent", autowire = Autowire.BY_NAME)
	public Student myStudentCreater() {
		return new Student("aimi", 33);
	}

}
