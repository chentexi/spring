package com.trent;

import com.trent.bean.Person;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 4:07
 * @program: spring
 * @Description:
 */
public class MainTest{
	
	private static final Log log= LogFactory.getLog(MainTest.class);
	public static void main(String[] args){
		log.info("dda");
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean(Person.class);
		person.setName("李四");
		System.out.println(person);
		
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Person.class);
		Person bean = applicationContext.getBean(Person.class);
		bean.setName("dfhdu");
		System.out.println(bean);
	}
}
