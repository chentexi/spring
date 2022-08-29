package com.trent.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/8/26 23:24
 * @program: spring
 * @Description:
 */
@Aspect
@Component
@Order(1)
public class AspectJBean{

	//相同的切入点
	@Pointcut(value = "execution(* com.trent.aop.SysLogin.*(..))")
	public void sjjs(){
	
	}
	
	@Before(value = "sjjs()")
	public void before(){
		System.out.println("before.......");
	}
	@Around(value = "sjjs()")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("Around之前.......");
		joinPoint.proceed();
		System.out.println("Around之后.......");
		
	}
	@After(value = "sjjs()")
	public void after(){
		System.out.println("After.......");
	}
	@AfterThrowing(value = "sjjs()")
	public void afterThrowing(){
		System.out.println("AfterThrowing.......");
	}
	@AfterReturning(value = "sjjs()")
	public void AfterReturning(){
		System.out.println("AfterReturning.......");
	}
}
