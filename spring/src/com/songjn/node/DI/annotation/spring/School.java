package com.songjn.node.DI.annotation.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:17:22 PM
 * @desc ע��ע��ֵ Component---���
 * 
 * ֪ʶ�㣺��@Componentע�⹦����ͬ�������岻ͬ��ע��������
 * �� @Repository��ע����Daoʵ������
 * �� @Service��ע����Serviceʵ������
 * �� @Controller��ע����SpringMVC��������
 */
// @Component(value="mySchool")
// ��ֻ��value��ʱ��ֱ��д�ַ���
@Component("mySchool")//�������ʾ��ǰ�౻spring��������
@Scope("prototype")//Ĭ����singleton
public class School {
	@Value("�ɹ���")
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "School [name=" + name + "]";
	}

}
