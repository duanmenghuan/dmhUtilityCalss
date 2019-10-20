package com.bw.test;



import org.junit.Test;


import com.bw.utility.StringUtility;

public class Test1 {
    
	@Test
	public void jia(){
		int a = 1;
		int b =  3;
		String percentage = StringUtility.percentage(a, b);
		System.out.println(percentage);
	}
}
