/** 
 * Project Name:java8sth 
 * File Name:PrintApple.java 
 * Package Name:java8sth.chap3 
 * Date:2018年12月26日上午4:40:58 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.chap3;

import java8sth.utils.ApplesUtils;

/** 
 * ClassName:PrintApple <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月26日 上午4:40:58 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
@FunctionalInterface
public interface PrintApple {

	int printAppleInfo(ApplesUtils utils) throws NullPointerException;
	
}
  