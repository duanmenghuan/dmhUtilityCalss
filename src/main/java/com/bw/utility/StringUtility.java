package com.bw.utility;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtility {
	
	public static char arr[] = new char[36];
	//��ʼ������
	static{
		int index=0;
		for (char i = 'a'; i < 'z'; i++) {
			arr[(int)index++]=i;
		}
		
		for (char i = '0'; i < '9'; i++) {
			arr[(int)index++]=i;
		}
	}
	

	 /**
	  * 
	  * @Title: isEmpty
	  * @Description:�ж�Ϊ��
	  * @param str
	  * @return
	  */
	 public  static boolean isEmpty(String str){
		 
		return (str==null || "".equals(str.trim())) ; 
	 }
	 
	 /**
	  * 
	  * @Title: isvalue
	  * @Description: TODO(�ж��Ƿ���ֵ)
	  * @param str
	  * @return
	  */
	 public static boolean isvalue(String str){
		 	
		 return !(str==null || "".equals(str.trim())) ; 
	 }
	
	
	 /**
	  * 
	  * @Title: randomChar
	  * @Description: TODO(���10λӢ����ĸ)
	  * @param n
	  * @return
	  */
	 public static String randomChar(int n){
		  Random random = new Random();
		  String str = "";
		
		  for (int i = 0; i < n ; i++) {
			  char y = (char)('a'+ random.nextInt(26));
			 str+=y;
		}
		  
		  
		  return  str; 
	 }
	 /**
	  * 
	  * @Title: randomCharAndNumber
	  * @Description: TODO(��֮����nλ  Ӣ����������ַ���)
	  * @param n
	  * @return
	  */
	 public  static String randomCharAndNumber(int n){
		  StringBuilder sr = new  StringBuilder();
		   Random random = new Random();
		   for (int i = 0; i < n; i++) {
			sr.append(arr[random.nextInt(36)]);
		}
		return sr.toString(); 
	 }
	 
	 /**
	  * 
	  * @Title: getFilename
	  * @Description: TODO(��ȡһ���ļ����Ƶ���չ�� ����pom.xml)
	  * @param filename
	  * @return
	  */
	 public static String getFilename(String filename){
		 int lastIndexOf = filename.lastIndexOf(".");
		 if(lastIndexOf==-1)
		return "";
		 
		return filename.substring(filename.lastIndexOf(".")); 
	 }
	 /**
	  * 
	  * @Title: isNumString
	  * @Description: TODO(�ж��Ƿ��������ַ���)
	  * @param str
	  * @return
	  */
	 public static boolean isNumString(String str){
		 String reg = "^[0-9]+$";
		return str.matches(reg);
	 }
	 
	     /**
	      * 
	      * @Title: isEmail
	      * @Description: TODO(��֤����)
	      * @param str
	      * @return
	      */
		public static boolean isEmail(String str) {
			String reg = "^[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.[a-z]{2,3}";
			return str.matches(reg);
			
		}
	 
		/**
		 * 
		 * @Title: isMobile
		 * @Description: TODO(��֤һ���ַ����Ƿ�Ϊ��ȷ�绰��)
		 * @param mobile
		 * @return
		 */
		public  static boolean isPhone(String mobile) {
			
			String regex = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(mobile);
			boolean isMatch = m.matches();
			return isMatch;
		}
		/**
		 * 
		 * @Title: toHtml
		 * @Description: TODO(ת��ΪHTML�ı�)
		 * @param text
		 * @return
		 */
		public static  String toHtml(String src){
			String dst = src.replaceAll("\r\n","\n");
			dst=dst.replaceAll("\n","</p><p>");
			dst="<p>"+dst+"</p>";
			dst=dst.replaceAll("\r","<br/>");
			return dst;
		}
		
}
