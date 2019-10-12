package com.bw.utility;

import java.text.SimpleDateFormat;
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
	
	/**
	 * 
	 * @Title: isToday
	 * @Description: TODO(判断是否为当天)
	 * @param date
	 * @return
	 */
	public static boolean isToday(Date date){
		 SimpleDateFormat smt = new SimpleDateFormat("yyyyMMdd");
		 String dateStr = smt.format(date);
		 String todayStr = smt.format(new Date());
		return dateStr.equals(todayStr);
	}

	/**
	 * 
	 * @Title: isThisYear
	 * @Description: TODO(判断是否是今年)
	 * @param date
	 * @return
	 */
	public static boolean isThisYear(Date date){
		 SimpleDateFormat smt = new SimpleDateFormat("yyyy");
		 String dateStr = smt.format(date);
		 String todayStr = smt.format(new Date());
		 return dateStr.equals(todayStr);	
	}
	/**
	 * 
	 * @Title: getMonthStart
	 * @Description: TODO( 给定时间对象，初始化到该月初的1日0时0分0秒0毫秒)
	 * @param date
	 * @return
	 */
	public static Date getMonthStart(Date date){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM,Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH,1);
		return cal.getTime();
	}
	/**
	 * 
	 * @Title: getMonthEnd
	 * @Description: TODO(求月末)
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//设置0秒
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.AM_PM,Calendar.AM);
		cal.set(Calendar.DAY_OF_MONTH,1);
		cal.add(Calendar.MONTH, 1);
		cal.add(Calendar.SECOND, -1);
		return cal.getTime();
	}

	
}
