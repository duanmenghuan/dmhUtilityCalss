package com.bw.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	/**
	 * 
	 * @Title: calAge
	 * @Description: TODO(ͨ����ǰʱ���������)
	 * @param bir
	 * @return
	 */
	public static int calAge(Date bir){
		Calendar cal = Calendar.getInstance();
		cal.setTime(bir);
		//��ȡ������������
		int birthYear = cal.get(Calendar.YEAR); //��
		int birthMonth = cal.get(Calendar.MONTH);
		int birthDate = cal.get(Calendar.DAY_OF_MONTH);
		
		//��ȡ�����������
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
	 * @Description: TODO(�ж��Ƿ�Ϊ����)
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
	 * @Description: TODO(�ж��Ƿ��ǽ���)
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
	 * @Description: TODO( ����ʱ����󣬳�ʼ�������³���1��0ʱ0��0��0����)
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
	 * @Description: TODO(����ĩ)
	 * @param date
	 * @return
	 */
	public static Date getMonthEnd(Date date) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//����0��
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
