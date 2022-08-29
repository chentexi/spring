package com.trent.dao.impl;

import com.trent.dao.PersonDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: Trent
 * @Date: 2022/8/25 15:45
 * @program: spring
 * @Description:
 */
@Repository
public class PersonDaoImpl implements PersonDao{
	//@Resource
	//private Jdbctemplate
	@Override
	public void add(){
		System.out.println("add...");
		
	}
}
