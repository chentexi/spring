package com.trent.configuration;

import com.trent.MyBeanFactoryPostProcessor;
import com.trent.service.impl.PersonServiceImpl;
import com.trent.service.impl.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: Trent
 * @Date: 2022/9/1 18:37
 * @program: spring
 * @Description:
 */

@Configuration
public class MyConfig{
	
	@Bean
	public PersonServiceImpl personService(){
		return new PersonServiceImpl();
	}
	
	@Bean
	@Scope("prototype")
	public UserService userService(){
		return new UserService();
	}
	
	@Bean
	public MyBeanFactoryPostProcessor processor(){
		return new MyBeanFactoryPostProcessor();
	}
}
