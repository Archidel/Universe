package com.archidel.universe.service.impl;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.user.User;
import com.archidel.universe.dao.UserDao;
import com.archidel.universe.service.UserService;
import com.archidel.universe.service.exception.ServiceException;
import com.archidel.universe.service.exception.ValidationServiceException;
import com.archidel.universe.service.validation.ValidationUserData;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public User verificationAccount(Account account) throws ServiceException {

		if (!ValidationUserData.validAccount(account)) {
			throw new ValidationServiceException("Incorrect user data");
		}

		User user = null;
		try {
			user = userDao.verificationAccount(account);
		} catch (NoResultException e) {
			throw new ServiceException("User not found");
		}

		return user;
	}

}
