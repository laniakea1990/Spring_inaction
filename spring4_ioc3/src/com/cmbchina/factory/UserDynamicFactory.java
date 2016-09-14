package com.cmbchina.factory;

import com.cmbchina.vo.User;

public class UserDynamicFactory {
	public User newInstance(String name){
		return new User(name);
	}
}
