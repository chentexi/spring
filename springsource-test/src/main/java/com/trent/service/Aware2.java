package com.trent.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @Author: Trent
 * @Date: 2022/9/1 16:56
 * @program: spring
 * @Description:
 */
public class Aware2 implements BeanFactoryAware{
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
	
	}
}
