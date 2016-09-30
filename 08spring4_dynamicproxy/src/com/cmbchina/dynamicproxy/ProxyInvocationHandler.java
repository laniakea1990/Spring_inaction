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
	
	private Object target;//Ŀ�����---��ʵ����
	public void setTarget(Object target) {
		this.target = target;
	}
	
	/**
	 * ���ɴ���ʵ��---������Ĵ������
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), 
				target.getClass().getInterfaces(), this);
	}
	
	/**
	 * proxy�Ǵ�����
	 * method ������ĵ��ô������ķ�������
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO �Զ����ɵķ������
		System.out.println("args="+args[0]);
		log(method.getName());
		Object result = method.invoke(target, args);
		return result;
	}
	
	public void log(String methodName){
		System.out.println("ִ��"+methodName+"����");
	}
}
