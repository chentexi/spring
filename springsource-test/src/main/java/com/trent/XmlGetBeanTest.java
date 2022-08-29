package com.trent;

import com.trent.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 16:07
 * @program: spring
 * @Description:
 */
public class XmlGetBeanTest{
	public static void main(String[] args){
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		//PersonService personService = context.getBean("personService", PersonService.class);
		//personService.test();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Person person = context.getBean("person", Person.class);
		person.toString();
		System.out.println(person);
	}
}
