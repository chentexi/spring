package com.trent.bean;

/**
 * @Author: Trent
 * @Date: 2022/8/25 4:06
 * @program: spring
 * @Description:
 */
public class Person{
	private String name;
	
	private Dept dept;
	public Person(){
	}
	public Dept getDept(){
		return dept;
	}
	public void setDept(Dept dept){
		this.dept = dept;
	}
	public Person(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
	//public String toString(){
	//	return "\'Person\':{" + "\'name\':\'" + name + '\'' + "," + "\'dept\':" + dept + '}';
	//}
}
