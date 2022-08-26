package com.trent;

import com.trent.bean.Collection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 16:45
 * @program: spring
 * @Description:
 */
public class XmlCollectionTest{
	
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		Collection collection = context.getBean("collection", Collection.class);
		System.out.println(collection);
		
	}
}
