/** 
 * Project Name:java8sth 
 * File Name:Apple.java 
 * Package Name:java8sth.entity 
 * Date:2018年12月20日上午12:17:56 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package java8sth.entity;

import java8sth.utils.IntUtils;
import java8sth.utils.StrUtils;

/** 
 * ClassName:Apple <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月20日 上午12:17:56 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class Apple {
	
	private String name;
	private String color;
	private Integer weight;
	
	public Apple() {
		this.name = StrUtils.getRandomName();
		this.color = StrUtils.getRandomColor();
		this.weight = IntUtils.getRandomNum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}

}
  