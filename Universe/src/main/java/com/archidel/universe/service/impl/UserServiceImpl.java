package com.archidel.universe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.User;
import com.archidel.universe.dao.UserDao;
import com.archidel.universe.service.UserService;
import com.archidel.universe.service.exception.ServiceException;
import com.archidel.universe.service.exception.ValidationServiceException;
import com.archidel.universe.service.validation.ValidationUserData;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private	UserDao userDao;
	
	@Override
	public User verificationAccount(Account account) throws ServiceException {
		
		if(!ValidationUserData.validAccount(account)) {
			throw new ValidationServiceException("incorrect user data");
		}
		
		User user  = userDao.verificationAccount(account);
		
		if(user == null) {
			throw new ServiceException("login or password error");
		}
		
		return user;
	}

}
