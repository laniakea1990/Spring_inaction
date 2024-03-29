package com.cmbchina.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log{
	@Before("execution(* com.cmbchina.impl.*.*(..))")
	public void before(){
		// TODO 自动生成的方法存根
		System.out.println("------方法执行前------");
	}
	@After("execution(* com.cmbchina.impl.*.*(..))")
	public void after(){
		// TODO 自动生成的方法存根
		System.out.println("------方法执行后------");
	}
	@Around("execution(* com.cmbchina.impl.*.*(..))")
	public void aroud(ProceedingJoinPoint jPoint) throws Throwable{
		System.out.println("环绕前！");
		System.out.println("签名："+jPoint.getSignature());
		//执行目标方法
		jPoint.proceed();
		System.out.println("环绕后！");
		
	}
	
}
