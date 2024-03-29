package com.cmbchina.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
//	private Rent rent;
//	
//	public void setRent(Rent rent) {
//		this.rent = rent;
//	}
	
	private Object target;//目标对象---真实对象
	public void setTarget(Object target) {
		this.target = target;
	}
	
	/**
	 * 生成代理实例---代理类的代理对象
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	/**
	 * proxy是代理类
	 * method 代理类的调用处理程序的方法对象
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println("args="+args[0]);
		log(method.getName());
		Object result = method.invoke(target, args);
		return result;
	}
	
	public void log(String methodName){
		System.out.println("执行"+methodName+"方法");
	}
}
