package com.trent;

import com.trent.bean.Dept;
import com.trent.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 23:03
 * @program: spring
 * @Description:
 */
public class SignBeanTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans6.xml");
		Person person = context.getBean("person", Person.class);
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person);
		System.out.println(person1);
		
		Dept dept = context.getBean("dept", Dept.class);
		Dept dept2 = context.getBean("dept", Dept.class);
		System.out.println(dept);
		System.out.println(dept2);
	}
}
