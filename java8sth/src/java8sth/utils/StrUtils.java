/** 
 * Project Name:java8sth 
 * File Name:StrUtils.java 
 * Package Name:java8sth.utils 
 * Date:2018年12月20日上午12:20:04 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.utils;  
/** 
 * ClassName:StrUtils <br/> 
 * Function: The utils of string. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月20日 上午12:20:04 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class StrUtils {
	
	private static final String TEXT = "oiurnkjxcbvbtyuqtiquwopaldvnkzxhcgiudsyrewbkajdhf";
	private static final String[] COLORS = {"red","green","yellow"};

	public static String getRandomName() {
		int s = (int) (Math.random()*TEXT.length()) - 1;
		int e = (int) (Math.random()*TEXT.length()) - 1;
		if(s<e) {
			return TEXT.substring(s,e);
		}else {
			return TEXT.substring(e,s);
		}
	}
	
	public static String getRandomColor() {
		return COLORS[(int) (Math.random()*3)];
	}
	
}
  