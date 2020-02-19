package com.spring.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.PrintName;



public class Printt {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		PrintName pn=(PrintName) context.getBean("g1");
		System.out.println(pn.print("pushpa"));
	}

}
