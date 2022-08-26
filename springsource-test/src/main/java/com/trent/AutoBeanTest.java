package com.trent;

import com.trent.bean.AutoBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Trent
 * @Date: 2022/8/26 0:33
 * @program: spring
 * @Description:
 */
public class AutoBeanTest{
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");
		AutoBean autoBean = context.getBean("autoBean", AutoBean.class);
		System.out.println(autoBean);
	}
}
