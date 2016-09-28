package com.cmbchina.bean;

public class Hello {

	public Hello() {
		// TODO 自动生成的构造函数存根
		System.out.println("Hello对象被创建.");
	}
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("Hello,"+name);
	}
}
