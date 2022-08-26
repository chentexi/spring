package com.trent.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @Author: Trent
 * @Date: 2022/8/25 23:37
 * @program: spring
 * @Description:
 */
public class BeanCyclePost implements BeanPostProcessor{
	@Nullable
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("方法初始化之前.....");
		return bean;
	}
	
	@Nullable
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("方法初始化之后.....");
		return bean;
	}

}
