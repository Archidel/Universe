package com.archidel.universe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.User;
import com.archidel.universe.dao.UserDao;
import com.archidel.universe.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private	UserDao userDao;
	
	@Override
	public User verificationAccount(Account account) {
		userDao.verificationAccount(account);
		return null;
	}

}
