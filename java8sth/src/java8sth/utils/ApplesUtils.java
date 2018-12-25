/** 
 * Project Name:java8sth 
 * File Name:ApplesUtils.java 
 * Package Name:java8sth.utils 
 * Date:2018年12月26日上午3:58:36 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.utils;

import java.util.ArrayList;
import java.util.List;

import java8sth.entity.Apple;

/** 
 * ClassName:ApplesUtils <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月26日 上午3:58:36 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class ApplesUtils {
	
	public static List<Apple> getApples(int counts) {
		List<Apple> apples = new ArrayList<>();
		while(counts>0) {
			apples.add(new Apple());
			counts--;
		}
		return apples;
	}
	
	public  int getAppleCounts(List<Apple> apples) {
		return apples.size();
	}
	
	public int getAppleWeight(Apple apple) {
		return apple.getWeight();
	}

}
  