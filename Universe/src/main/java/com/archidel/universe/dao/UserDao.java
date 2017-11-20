package com.archidel.universe.dao;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.User;

public interface UserDao {
	User verificationAccount(Account account);
}
