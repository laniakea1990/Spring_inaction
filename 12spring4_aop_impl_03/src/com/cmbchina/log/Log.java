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
		// TODO �Զ����ɵķ������
		System.out.println("------����ִ��ǰ------");
	}
	@After("execution(* com.cmbchina.impl.*.*(..))")
	public void after(){
		// TODO �Զ����ɵķ������
		System.out.println("------����ִ�к�------");
	}
	@Around("execution(* com.cmbchina.impl.*.*(..))")
	public void aroud(ProceedingJoinPoint jPoint) throws Throwable{
		System.out.println("����ǰ��");
		System.out.println("ǩ����"+jPoint.getSignature());
		//ִ��Ŀ�귽��
		jPoint.proceed();
		System.out.println("���ƺ�");
		
	}
	
}