package com.iweb.qidian.service;

import com.iweb.qidian.model.UserInfo;

import java.util.List;



public interface UserServiceI {
	List<UserInfo> selectByUser(UserInfo user);
	boolean insert(UserInfo user);
	
}
