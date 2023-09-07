package com.trent;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/1 15:34
 * @program: spring
 * @Description:
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException{
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for( String beanName :beanDefinitionNames ){
			System.out.println(beanName);
		}
	}
}
