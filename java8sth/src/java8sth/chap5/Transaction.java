/** 
 * Project Name:java8sth 
 * File Name:Transaction.java 
 * Package Name:java8sth.chap5 
 * Date:2018年12月27日下午11:44:56 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap5;

import lombok.Data;
import lombok.ToString;

/** 
 * ClassName:Transaction <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月27日 下午11:44:56 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
@Data
@ToString
public class Transaction {

	private final Trader trader;
	private final int year;
	private final int value;
	
	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
}
  