package com.trent;

import com.trent.aop.SysLogin;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/26 23:34
 * @program: spring
 * @Description:
 */
public class AopTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspectJ.xml");
		SysLogin sysLogin = context.getBean("sysLogin", SysLogin.class);
		sysLogin.login("2","3");
	}
}
