package com.trent.bean;

/**
 * @Author: Trent
 * @Date: 2022/8/26 0:31
 * @program: spring
 * @Description:
 */
public class AutoBean{
	private Person person;
	
	public Person getPerson(){
		return person;
	}
	public void setPerson(Person person){
		this.person = person;
	}
	
	@Override
	public String toString(){
		return "\'AutoBean\':{" + "\'person\':" + person + '}';
	}
}
