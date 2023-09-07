package com.trent.creantebeanfinish;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/5 18:07
 * @program: spring
 * @Description: bean创建完成后
 */
@Component
public class SmartExttend implements SmartInitializingSingleton{
	@Override
	public void afterSingletonsInstantiated(){
		
		System.out.println("SmartInitializingSingleton .........................");
	}
}
