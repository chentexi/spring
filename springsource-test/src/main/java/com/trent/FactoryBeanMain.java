package com.trent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/9/1 1:40
 * @program: spring
 * @Description:
 */
public class FactoryBeanMain{
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		FactionBean factionBean = (FactionBean) context.getBean("factionBean");
	}
}
