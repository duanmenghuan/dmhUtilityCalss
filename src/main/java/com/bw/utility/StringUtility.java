package com.bw.utility;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.NumberFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtility {
	
	public static char arr[] = new char[36];
	//初始化数组
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
	  * @Description:判断为空
	  * @param str
	  * @return
	  */
	 public  static boolean isEmpty(String str){
		 
		return (str==null || "".equals(str.trim())) ; 
	 }
	 
	 /**
	  * 
	  * @Title: isvalue
	  * @Description: TODO(判断是否有值)
	  * @param str
	  * @return
	  */
	 public static boolean isvalue(String str){
		 	
		 return !(str==null || "".equals(str.trim())) ; 
	 }
	
	
	 /**
	  * 
	  * @Title: randomChar
	  * @Description: TODO(随机10位英文字母)
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
	  * @Description: TODO(随之生成n位  英文数字随机字符串)
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
	  * @Description: TODO(获取一个文件名称的扩展名 列如pom.xml)
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
	  * @Description: TODO(判断是否是数字字符串)
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
	      * @Description: TODO(验证邮箱)
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
		 * @Description: TODO(验证一个字符串是否为正确电话号)
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
		 * @Description: TODO(转换为HTML文本)
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
		
		 /**
		  * 
		  * @Title: isNumString
		  * @Description: TODO(判断是否是数字字符串)
		  * @param str
		  * @return
		  */
		 public static boolean isNumber(String str){
			 String reg = "^[0-9]+\\.?[0-9]*$";
			return str.matches(reg);
		 }
		 /**
		  * 
		  * @Title: splitincision
		  * @Description: TODO(字符串切割)
		  * @param str
		  * @param variable
		  * @param i
		  * @return
		  */
		 public static  String  splitincision(String str,String variable,int i){
			 String[] split = str.split(variable);
			return  split[i];
		}
		 /**
		  * 计算百分百
		  * @return
		  */
		public static String  percentage(Integer onesum,Integer sum)
		{
			//创建一个数值格式化对象
			NumberFormat numberFormat = NumberFormat.getInstance();
			numberFormat.setMaximumFractionDigits(0);
			String  result = numberFormat.format(((float)onesum/(float)sum)*100);
			return result ;
		}


	public static boolean isUrl(String str) {
		//转换为小写
		str = str.toLowerCase();
		String regex = "^((https|http|ftp|rtsp|mms)?://)"  //https、http、ftp、rtsp、mms
				+ "?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?" //ftp的user@
				+ "(([0-9]{1,3}\\.){3}[0-9]{1,3}" // IP形式的URL- 例如：199.194.52.184
				+ "|" // 允许IP和DOMAIN（域名）
				+ "([0-9a-z_!~*'()-]+\\.)*" // 域名- www.
				+ "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\." // 二级域名
				+ "[a-z]{2,6})" // first level domain- .com or .museum
				+ "(:[0-9]{1,5})?" // 端口号最大为65535,5位数
				+ "((/?)|" // a slash isn't required if there is no file name
				+ "(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$";
		return  str.matches(regex);
	}



	/*
	 * 方法：生成唯一标签名，处理步骤：
	 * 1、全部变成小写；
	 * 2、清空两边的空格，把中间所有的空格替换成“-”；
	 * 3、使用URLEncoder.encode()编码
	 * 最后返回处理的结果。
	 * 举例“Spring MVC”处理后为“spring-mvc”，“Spring Mvc”处理后也为“spring-mvc”
	 */
	public static String toUniqueTerm(String term) throws UnsupportedEncodingException {
		//TODO 实现代码
		term=term.toLowerCase();
		term=term.trim();
		term = term.replaceAll(" ", "-");
		return URLEncoder.encode(term,"UTF-8");

	}





}
