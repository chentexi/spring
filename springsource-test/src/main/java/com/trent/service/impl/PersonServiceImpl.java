package com.trent.service.impl;

import com.trent.dao.PersonDao;
import com.trent.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * @Author: Trent
 * @Date: 2022/8/25 15:45
 * @program: spring
 * @Description:
 */
@Service
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
}
