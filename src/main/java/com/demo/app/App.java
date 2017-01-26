package com.demo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorldBean bean = (HelloWorldBean) context.getBean("helloWorld");

		bean.getMessage();
	}
}
