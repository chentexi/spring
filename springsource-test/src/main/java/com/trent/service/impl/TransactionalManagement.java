package com.trent.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Trent
 * @Date: 2022/8/28 1:09
 * @program: spring
 * @Description:
 */
@Service
public class TransactionalManagement{
	
	@Transactional
	public void TransactionalMethod(){
	
	}
}
