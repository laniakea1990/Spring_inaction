package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.di.Student;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("resource")
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)aContext.getBean("student");
		student.show();
	}

}
