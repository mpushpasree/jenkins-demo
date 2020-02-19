package com.spring.service;

public class PrintServiceSimpleImpl implements PrintName {

	public String print(String userName) {
		
		return "Hello"+userName;
	}

}
