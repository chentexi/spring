package com.trent.bean.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Trent
 * @Date: 2022/8/25 18:10
 * @program: spring
 * @Description:
 */
public class MyBean implements FactoryBean<City>{
	@Override
	public City getObject() throws Exception{
		City city =new City();
		city.setName("dji");
		return city;
	}
	@Override
	public Class<?> getObjectType(){
		return null;
	}
	@Override
	public boolean isSingleton(){
		return FactoryBean.super.isSingleton();
	}
}
