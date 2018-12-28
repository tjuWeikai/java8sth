/** 
 * Project Name:java8sth 
 * File Name:Trader.java 
 * Package Name:java8sth.chap5 
 * Date:2018年12月27日下午11:49:29 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap5;

import lombok.Data;
import lombok.ToString;

/** 
 * ClassName:Trader <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月27日 下午11:49:29 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */

@Data
@ToString
public class Trader {

	private final String name;
	private final String city;
	
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	
}
  