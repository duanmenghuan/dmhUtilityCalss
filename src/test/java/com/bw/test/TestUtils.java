package com.bw.test;

import java.util.Date;

import com.bw.utility.DateUtility;
import com.bw.utility.StringUtility;


public class TestUtils {
	public static void main(String[] args) {
		String html = StringUtility.toHtml("����\r\n����\r����");
		System.out.println(html);
	}
	
		

}
