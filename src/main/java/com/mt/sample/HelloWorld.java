package com.mt.sample;

/**
 * Hello world!
 *
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Engineer Oyelola, Welcome to Landmark Technologies DevOps Master Class. You are sudying Maven Build Tool. !! Today Date is:  " + getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		String m = "Landmark Technologies";
		return new Date();

	}

}
