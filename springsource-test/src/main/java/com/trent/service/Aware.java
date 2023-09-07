package com.trent.service;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @Author: Trent
 * @Date: 2022/9/1 16:53
 * @program: spring
 * @Description:
 */
public class Aware implements BeanNameAware{
	private String beanName;
	@Override
	public void setBeanName(String name){
	
	}
}
