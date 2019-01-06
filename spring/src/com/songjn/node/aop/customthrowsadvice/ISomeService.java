package com.songjn.node.aop.customthrowsadvice;

public interface ISomeService {

	boolean login(String username,String password) throws UserException;
}
