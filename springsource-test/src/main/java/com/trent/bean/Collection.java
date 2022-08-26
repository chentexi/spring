package com.trent.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Trent
 * @Date: 2022/8/25 16:43
 * @program: spring
 * @Description:
 */
public class Collection{
	
	private String[] arrays;
	private List<String> list;
	private Map<String,Object> map;
	private Set<String> sets;
	
	private List<Person> personList;
	
	
	public List<Person> getPersonList(){
		return personList;
	}
	public void setPersonList(List<Person> personList){
		this.personList = personList;
	}
	public void setArrays(String[] arrays){
		this.arrays = arrays;
	}
	public List<String> getList(){
		return list;
	}
	public void setList(List<String> list){
		this.list = list;
	}
	public Map<String, Object> getMap(){
		return map;
	}
	public void setMap(Map<String, Object> map){
		this.map = map;
	}
	public Set<String> getSets(){
		return sets;
	}
	public void setSets(Set<String> sets){
		this.sets = sets;
	}
	@Override
	public String toString(){
		return "\'Collection\':{" + "\'arrays\':" + arrays + "," + "\'list\':" + list + "," + "\'map\':" + map + "," + "\'sets\':" + sets + '}';
	}
}
