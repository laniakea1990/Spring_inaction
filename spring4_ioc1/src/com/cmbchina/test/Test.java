package com.cmbchina.test;

import com.cmbchina.dao.impl.UserDaoMysqlImpl;
import com.cmbchina.dao.impl.UserDaoOracleImpl;
import com.cmbchina.service.UserService;
import com.cmbchina.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoMysqlImpl());
		userService.getUser();
		System.out.println("-------------");
		userService.setUserDao(new UserDaoOracleImpl());
		userService.getUser();
	}
}
