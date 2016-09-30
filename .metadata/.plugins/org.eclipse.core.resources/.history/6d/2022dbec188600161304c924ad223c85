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
		//日志，安全，缓存，事务，异常处理等公共业务
		log("delete");
		userService.delete();
	}

	@Override
	public void search() {
		log("search");
		userService.search();
	}
	
	public void log(String methodName){
		System.out.println("执行"+methodName+"方法");
	}

}
