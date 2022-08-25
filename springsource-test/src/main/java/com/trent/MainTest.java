package com.trent;

import com.trent.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 4:07
 * @program: spring
 * @Description:
 */
public class MainTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean(Person.class);
		person.setName("李四");
		System.out.println(person);
	}
}
