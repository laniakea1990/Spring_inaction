package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//�쳣֪ͨ
public class ExceptionLog implements ThrowsAdvice {

    public void afterThrowing(Method method, Exception ex) throws Throwable {
        // Do something with remote exception
    	System.out.println("�����쳣��");
    	ex.printStackTrace();
    }

}
