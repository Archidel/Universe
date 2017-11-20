package com.archidel.universe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.archidel.universe.bean.Account;
import com.archidel.universe.bean.User;
import com.archidel.universe.service.UserService;

@RestController
@RequestMapping(value = "/game")
public class GameController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
	public @ResponseBody User loginUser(@RequestBody Account account) {
		System.out.println(account.toString());
//		userService.verificationAccount(account);
		User user = new User();
		user.setLogin("MyLogin");
		user.setPassword("MyPassword");
		return user;
	}

	@RequestMapping(value = "/my", method = RequestMethod.POST)
	public @ResponseBody void doSomeThing(@RequestBody User user) {
		System.out.println(user.toString());
	}

}
