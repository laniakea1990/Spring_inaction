package com.cmbchina.vo;

public class User {

	private String name;
	
	public User() {
		// TODO 自动生成的构造函数存根
		System.out.println("user的无参构造法方法");
	}
	
	public User(String name) {
//		 TODO 自动生成的构造函数存根
		super();
		this.name = name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public void show(){
		System.out.println("name="+name);
	}
}
