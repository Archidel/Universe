package com.archidel.universe.service.validation;

import com.archidel.universe.bean.Account;

public final class ValidationUserData {

	private ValidationUserData() {
	}

	public static boolean validAccount(Account account) {
		if (validString(account.getLogin()) && validString(account.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean validString(String line) {
		if (line == null & line.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}
