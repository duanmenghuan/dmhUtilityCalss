package com.bw.test;

import java.util.Date;

import com.bw.utility.DateUtility;
import com.bw.utility.StringUtility;


public class TestUtils {
	public static void main(String[] args) {
		String html = StringUtility.toHtml("张三\r\n李四\r王五");
		System.out.println(html);
	}
	
		

}
