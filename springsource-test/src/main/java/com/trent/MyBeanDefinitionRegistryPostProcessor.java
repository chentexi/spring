package com.trent;

import com.trent.service.PersonService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/1 15:36
 * @program: spring
 * @Description:
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException{
	
	}
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException{
		RootBeanDefinition rootBeanDefinition =new RootBeanDefinition(PersonService.class);
		registry.registerBeanDefinition("perons",rootBeanDefinition);
	}
}
