package com.trent;

import com.trent.service.PersonService;
import com.trent.service.impl.PersonServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author: Trent
 * @Date: 2022/8/26 22:13
 * @program: spring
 * @Description:
 */
public class JDKPoryXyTest{
	public static void main(String[] args){
		//创建接口实现类代理duix
	    Class<?>[] in = {PersonService.class};
		PersonServiceImpl personService = new PersonServiceImpl();
		//代理
		PersonService o = (PersonService) Proxy.newProxyInstance(JDKPoryXyTest.class.getClassLoader(), in, new proxyPerson(personService));
		o.test();
	}
}

class proxyPerson implements InvocationHandler{
	
	private Object object;
	public proxyPerson(){
	}
	public proxyPerson(Object object){
		this.object = object;
	}
	
	//编写增强逻辑
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		
		System.out.println("执行方法之前"+method.getName());
		Object invoke = method.invoke(object, args);
		System.out.println("执行方法之后"+ Arrays.toString(args));
		return invoke;
	}
	
}