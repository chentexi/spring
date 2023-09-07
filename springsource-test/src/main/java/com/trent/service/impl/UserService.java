package com.trent.service.impl;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/1 18:44
 * @program: spring
 * @Description:
 */
@Component
public class UserService implements SmartInitializingSingleton{
	
	private String name;
	
	public synchronized String chushu(String n){
		name = n;
		try{
			Thread.sleep(100);
		}catch( InterruptedException e ){
			throw new RuntimeException(e);
		}
		return name;
	}
	@Override
	public void afterSingletonsInstantiated(){
		System.out.println("dsfdfgdfgfdgfdgfdg");
	}
}
