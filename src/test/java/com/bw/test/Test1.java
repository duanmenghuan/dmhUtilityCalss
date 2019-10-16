package com.bw.test;

import org.junit.Test;

import com.bw.utility.MathUtility;

public class Test1 {
    
	@Test
	public void jia(){
		int a = 6;
		int b =6;
		int i = MathUtility.add(a, b);
		System.out.println(i);
	}
}
