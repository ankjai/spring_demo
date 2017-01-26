package com.demo.app;

/**
 * Created by ankit.jaiswal on 1/26/17.
 */
public class HelloWorldBean {
	private String message;

	public void getMessage() {
		System.out.println("Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
