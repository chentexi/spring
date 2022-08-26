package com.trent;

import com.trent.bean.BeanCycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/25 23:41
 * @program: spring
 * @Description:
 */
public class BeanCycleTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans7.xml");
		BeanCycle beanCycle = context.getBean("beanCycle", BeanCycle.class);
		System.out.println("4.开始获取对象....");
		System.out.println(beanCycle);
		
		context.close();
	}
}
