package com.cmbchina.vo;

public class User {

	private String name;
	
	public User() {
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("user���޲ι��취����");
	}
	
	public User(String name) {
//		 TODO �Զ����ɵĹ��캯�����
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
