package com.trent;

import com.trent.bean.Person;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/29 1:05
 * @program: spring
 * @Description:
 */
public class GenericApplicationContextTest{
	public static void main(String[] args){
		GenericApplicationContext genericApplicationContext =new GenericApplicationContext();
		genericApplicationContext.refresh();
		
		genericApplicationContext.registerBean("person",Person.class,()->new Person());
		Person person = (Person) genericApplicationContext.getBean("person");
		System.out.println(person);
	}
}
