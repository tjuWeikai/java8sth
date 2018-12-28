/** 
 * Project Name:java8sth 
 * File Name:ChapMain.java 
 * Package Name:java8sth.chap4 
 * Date:2018年12月26日下午11:13:28 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** 
 * ClassName:ChapMain <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月26日 下午11:13:28 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class ChapMain {

	public static void main(String[] args) {
		
		/**
		 * sth important down
		 * 1. flatMap create one stream while map for several.
		 */
		int[] a = new int[] {1,2,3};
		int[] b = new int[] {3,4};
		int[][] c = new int[6][6];
		List<Integer> n = Arrays.asList(1,2,3);
		List<Integer> m = Arrays.asList(3,4);
		
		List<int[]> nList = n.stream().flatMap(i -> m.stream().map(j -> new int[] {i,j})).collect(Collectors.toList());
		System.out.println(nList);
		
		n.stream().mapToInt(i -> i*i).boxed().count();
		
	}
}
  