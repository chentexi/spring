package com.trent.bean;

import com.trent.bean.factoryBean.City;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 18:11
 * @program: spring
 * @Description:
 */
public class FactoryBeanTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		City city = context.getBean("myBean", City.class);
		System.out.println(city);
	}
}
