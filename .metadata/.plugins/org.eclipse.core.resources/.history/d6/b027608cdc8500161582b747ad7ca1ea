package com.cmbchina.service;

public class UserServiceProxy implements UserService{
	private UserService userService;
	@Override
	public void add() {
		log("add");
		userService.add();
	}

	@Override
	public void update() {
		log("update");
		userService.delete();
	}

	@Override
	public void delete() {
		log("delete");
		userService.delete();
	}

	@Override
	public void search() {
		log("search");
		userService.search();
	}
	
	public void log(String methodName){
		System.out.println("Ö´ÐÐ"+methodName+"·½·¨");
	}

}
