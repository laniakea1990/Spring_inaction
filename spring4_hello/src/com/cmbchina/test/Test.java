package com.cmbchina.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.bean.Hello;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����beans.xml�ļ����ɹ�����Ӧ��bean����
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanFactory context = new ClassPathXmlApplicationContext("beans.xml");
		Hello hello = (Hello)context.getBean("h7");
//		Hello hello = context.getBean(Hello.class);
		hello.show();
	}
}