package com.bw.test;

import java.util.Date;

import com.bw.utility.DateUtility;


public class TestUtils {
	public static void main(String[] args) {
		Date date = new Date(100,0,6);
		int age = DateUtility.calAge(date);
		System.out.println(age);
	}

}
