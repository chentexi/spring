package com.trent.bean;

/**
 * @Author: Trent
 * @Date: 2022/8/25 23:37
 * @program: spring
 * @Description:
 */
public class BeanCycle{
	
	private String name;
	public BeanCycle(){
		System.out.println("1.开始创建bean...");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		System.out.println("2.开始set值......");
		this.name = name;
		System.out.println("2.设置set值结束......");
	}
	
	public void initMethod(){
		System.out.println("3.初始化方法....");
	}
	
	
	public void destroyMethod(){
		System.out.println("5.开始销毁方法....");
	}
}
