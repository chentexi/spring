package com.trent.aop;

import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/8/26 23:24
 * @program: spring
 * @Description:
 */
@Component
public class SysLogin{
	
	public void login(String name, String pwd){
		System.out.println("s"+name+"p"+pwd);
	}
}
