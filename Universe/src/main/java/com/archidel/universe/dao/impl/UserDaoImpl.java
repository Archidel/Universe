package com.archidel.universe.dao.impl;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.User;
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
		String hql = "from User u where u.login = :login";
		EntityManager manager = sessionFactory.createEntityManager();
		User user = (User) manager.createQuery(hql).setParameter("login", account.getLogin()).getSingleResult();
		System.out.println(user.toString());
		
		System.out.println(account.toString());
		return null;
	}
	
	

}
