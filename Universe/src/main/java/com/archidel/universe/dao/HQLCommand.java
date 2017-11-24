package com.archidel.universe.dao;

public final class HQLCommand {
	private HQLCommand() {
	}
	
	public static final String USER_BY_ACCOUNT = "FROM User u WHERE u.login = :login AND u.password = :password";
}
