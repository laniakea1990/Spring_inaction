package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.service.UserService;

public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService)context.getBean("service");
		userService.getUser();
	}
}
