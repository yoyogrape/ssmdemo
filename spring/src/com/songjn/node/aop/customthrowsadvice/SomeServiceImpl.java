package com.songjn.node.aop.customthrowsadvice;

public class SomeServiceImpl implements ISomeService {

	public boolean login(String username, String password)
			throws UserException {

		if (!"haha".equals(username)) {
			throw new UsernameException("�û�������");
		}
		if (!"123".equals(password)) {
			throw new PasswordException("�������");
		}
		return true;
	}

}
