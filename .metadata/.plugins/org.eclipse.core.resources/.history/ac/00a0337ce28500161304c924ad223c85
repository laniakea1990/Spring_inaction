package com.cmbchina.dynamicproxy;

import java.util.ArrayList;
import java.util.List;

import com.cmbchina.service.UserService;
import com.cmbchina.service.UserServiceImpl;

public class Client {
	public static void main(String[] args) {
//		UserService userService = new UserServiceImpl();
//		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
//		proxyInvocationHandler.setTarget(userService);
//		UserService proxy = (UserService)proxyInvocationHandler.getProxy();
//		proxy.delete();
		
		ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
		proxyInvocationHandler.setTarget(new ArrayList<>());
		List list = (List)proxyInvocationHandler.getProxy();
		list.add("hello");
	}
}
