package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

//异常通知
public class ExceptionLog implements ThrowsAdvice {

    public void afterThrowing(Method method, Exception ex) throws Throwable {
        // Do something with remote exception
    	System.out.println("发生异常！");
    	ex.printStackTrace();
    }

}
