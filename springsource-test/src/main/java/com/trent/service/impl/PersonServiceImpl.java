package com.trent.service.impl;

import com.trent.dao.PersonDao;
import com.trent.service.PersonService;

/**
 * @Author: Trent
 * @Date: 2022/8/25 15:45
 * @program: spring
 * @Description:
 */
public class PersonServiceImpl implements PersonService{
	
	private PersonDao personDao;
	public void setPersonDao(PersonDao personDao){
		this.personDao = personDao;
	}
	@Override
	public void test(){
		
		System.out.println("test....");
		personDao.add();
	}
	private String name;
	@Override
	public String getName(String name2){
		name="dvnusdb:"+name2;
		try{
			Thread.sleep(100);
		}catch( InterruptedException e ){
			throw new RuntimeException(e);
		}
		return name;
	}
}
