package com.archidel.universe.service;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.user.User;
import com.archidel.universe.service.exception.ServiceException;
import com.archidel.universe.service.exception.ValidationServiceException;

public interface UserService {
	User verificationAccount(Account account) throws ServiceException, ValidationServiceException;
}
