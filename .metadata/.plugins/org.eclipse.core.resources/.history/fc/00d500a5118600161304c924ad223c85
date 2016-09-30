package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	/**
	 *目标方法执行后执行的通知
	 *@param returnValue---返回值
	 *@param method---被调用的方法对象
	 *@param args---被调用的方法对象的参数
	 *@param target---被调用的方法对象的目标对象
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println(target.getClass().getName()+"的"+method.getName()+"被成功执行，返回值是: "+returnValue); 
	}

}
