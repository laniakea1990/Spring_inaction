package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.di.Student;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("resource")
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)aContext.getBean("student");
		student.show();
	}

}
