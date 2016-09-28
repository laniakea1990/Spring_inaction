package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.vo.User;

public class Test {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User)context.getBean("u4");
		user.show();
	}
}
