package com.bw.test;



import org.junit.Test;


import com.bw.utility.StringUtility;
import sun.reflect.generics.tree.VoidDescriptor;

public class Test1 {
    
	@Test
	public void jia(){
		int a = 1;
		int b =  3;
		String percentage = StringUtility.percentage(a, b);
		System.out.println(percentage);
	}

	@Test
	 public void  url(){
		boolean url = StringUtility.isUrl("www.baidu.com");
		System.out.println(url);

	}
}
