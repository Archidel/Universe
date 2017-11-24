package com.archidel.universe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.user.User;
import com.archidel.universe.service.UserService;
import com.archidel.universe.service.exception.ServiceException;
import com.archidel.universe.service.exception.ValidationServiceException;

@RestController
@RequestMapping(value = "/game")
public class GameController {

	private static final Logger logger = LoggerFactory.getLogger(GameController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public @ResponseBody User loginUser(@RequestBody Account account) {
		User user = null;

		try {
			user = userService.verificationAccount(account);
			logger.info(user.toString() + " has been verificated");
		} catch (ValidationServiceException e) {
			logger.error(account.toString(), e);
		} catch (ServiceException e) {
			logger.error(account.toString(), e);
		}

		return user;
	}

	@RequestMapping(value = "/my", method = RequestMethod.POST)
	public @ResponseBody void doSomeThing(@RequestBody User user) {
		System.out.println(user.toString());
	}

}
