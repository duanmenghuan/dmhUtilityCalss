package com.bw.utility;

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

}
