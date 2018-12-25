/** 
 * Project Name:java8sth 
 * File Name:FilterApples.java 
 * Package Name:java8sth.chap2 
 * Date:2018年12月26日上午3:57:23 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap3;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import java8sth.entity.Apple;
import java8sth.utils.ApplesUtils;

/** 
 * ClassName:FilterApples <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月26日 上午3:57:23 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class FilterApples {
	
	public static void main(String[] args) {
		List<Apple> apples = ApplesUtils.getApples(5);
		apples.sort(Comparator.comparing(Apple::getWeight));
		executeAround(weight -> weight > 20, apples.get(0));
	}
	
	public static void executeAround(IntPredicate p,Apple apple) throws NullPointerException{
		try {
			System.out.println(p.test(apple.getWeight()));
		} finally {
		}
	}
	
}
  