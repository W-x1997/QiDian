package com.iweb.qidian.service;

import java.util.List;

import com.iweb.qidian.model.UserInfo;

public interface UserServiceI {
	List<UserInfo> selectByUser(UserInfo user);
	boolean insert(UserInfo user);
	
}
