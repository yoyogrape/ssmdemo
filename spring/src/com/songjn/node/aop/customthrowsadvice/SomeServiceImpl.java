package com.songjn.node.aop.customthrowsadvice;

public class SomeServiceImpl implements ISomeService {

	public boolean login(String username, String password)
			throws UserException {

		if (!"haha".equals(username)) {
			throw new UsernameException("ÓÃ»§Ãû´íÎó");
		}
		if (!"123".equals(password)) {
			throw new PasswordException("ÃÜÂë´íÎó");
		}
		return true;
	}

}
