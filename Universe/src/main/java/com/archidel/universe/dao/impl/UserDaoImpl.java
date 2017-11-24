package com.archidel.universe.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.user.User;
import com.archidel.universe.dao.HQLCommand;
import com.archidel.universe.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public User verificationAccount(Account account) {
		User user = (User) getCurrentSession().createQuery(HQLCommand.USER_BY_ACCOUNT)
				.setParameter("login", account.getLogin())
				.setParameter("password", account.getPassword())
				.getSingleResult();
		return user;
	}

}
