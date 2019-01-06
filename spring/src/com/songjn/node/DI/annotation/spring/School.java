package com.songjn.node.DI.annotation.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author songjn
 * @date Sep 1, 2018 - 10:17:22 PM
 * @desc 注解注入值 Component---组件
 * 
 * 知识点：与@Component注解功能相同，但意义不同的注解有三个
 * ① @Repository：注解在Dao实现类上
 * ② @Service：注解在Service实现类上
 * ③ @Controller：注解在SpringMVC处理器上
 */
// @Component(value="mySchool")
// 当只有value的时候，直接写字符串
@Component("mySchool")//组件，表示当前类被spring容器管理
@Scope("prototype")//默认是singleton
public class School {
	@Value("辽工大")
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
