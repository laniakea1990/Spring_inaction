package com.cmbchina.bean;

public class Hello {

	public Hello() {
		// TODO �Զ����ɵĹ��캯�����
		System.out.println("Hello���󱻴���.");
	}
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("Hello,"+name);
	}
}
