package com.trent;

import com.trent.configuration.SpringConfigurationBean;
import com.trent.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/26 15:43
 * @program: spring
 * @Description:
 */
public class SpringConfigurationTest{
	
	public static void main(String[] args){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationBean.class);
		PersonService personService = context.getBean("personService", PersonService.class);
		personService.test();
	}
}
