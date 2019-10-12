package com.bw.utility;

import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	/**
	 * 
	 * @Title: calAge
	 * @Description: TODO(通过当前时间计算年龄)
	 * @param bir
	 * @return
	 */
	public static int calAge(Date bir){
		Calendar cal = Calendar.getInstance();
		cal.setTime(bir);
		//获取出生的年月日
		int birthYear = cal.get(Calendar.YEAR); //年
		int birthMonth = cal.get(Calendar.MONTH);
		int birthDate = cal.get(Calendar.DAY_OF_MONTH);
		
		//获取今天的年月日
		cal.setTime(new Date());
		int nowYear = cal.get(Calendar.YEAR); 
		int nowMonth = cal.get(Calendar.MONTH);
		int nowDate = cal.get(Calendar.DAY_OF_MONTH);
		
		int age = nowYear-birthYear;
		if(nowMonth<birthMonth){
			age--;
		}else if (nowMonth==birthMonth) {
			 if(nowDate<birthDate){
				 age--;
			 }
		}
		return age;
	}

}
