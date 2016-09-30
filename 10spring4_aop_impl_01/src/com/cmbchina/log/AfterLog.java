package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice{

	/**
	 *Ŀ�귽��ִ�к�ִ�е�֪ͨ
	 *@param returnValue---����ֵ
	 *@param method---�����õķ�������
	 *@param args---�����õķ�������Ĳ���
	 *@param target---�����õķ��������Ŀ�����
	 */
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO �Զ����ɵķ������
		System.out.println(target.getClass().getName()+"��"+method.getName()+"���ɹ�ִ�У�����ֵ��: "+returnValue); 
	}

}
