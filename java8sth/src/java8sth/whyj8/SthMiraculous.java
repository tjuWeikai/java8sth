/** 
 * Project Name:java8sth 
 * File Name:SthMiraculous.java 
 * Package Name:java8sth.whyj8 
 * Date:2018年12月20日上午12:16:41 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.whyj8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import java8sth.entity.Apple;

/** 
 * ClassName:SthMiraculous <br/> 
 * Function: Tell me the reason for choosing java8. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月20日 上午12:16:41 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class SthMiraculous {
	
	public static void main(String[] args) {
	}
	
	public static void sthMigicalFirst() {
		// Apples waited to sort
				List<Apple> apples1 = Arrays.asList(new Apple(),new Apple(),new Apple(),new Apple(),new Apple());
				List<Apple> apples2 = Arrays.asList(new Apple(),new Apple(),new Apple(),new Apple(),new Apple());
				
				apples1.stream().forEach(System.out::println);
				System.out.println("======");
				//Original sort method
				Collections.sort(apples1, new Comparator<Apple>() {
					public int compare(Apple a, Apple b) {
						return a.getWeight().compareTo(b.getWeight());
					}
				} );
				apples1.stream().forEach(System.out::println);
				System.out.println("======");
				
				apples2.stream().forEach(System.out::println);
				System.out.println("======");
				
				//Java8 sort method
				apples2.sort(Comparator.comparing(Apple::getWeight));
				
				apples2.stream().forEach(System.out::println);
	}

	public static void filterApples(List<Apple> apples, Predicate<Apple> filter) {
		List<Apple> res = new ArrayList<>();
		for (Apple apple : apples) {
			if (filter.test(apple)) {
				res.add(apple);
			}
		}
	}
	
	

}
  