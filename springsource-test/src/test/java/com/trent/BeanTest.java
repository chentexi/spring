package com.trent;

import com.trent.bean.Order;
import com.trent.bean.Person;
import com.trent.configuration.MyConfig;
import com.trent.event.OrderEvent;
import com.trent.service.FinishBean;
import com.trent.service.impl.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.Clock;

/**
 * @Author: Trent
 * @Date: 2022/9/1 18:09
 * @program: spring
 * @Description:
 */
public class BeanTest{
	@Test
	public void test1() throws InterruptedException{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Person.class);
		Person bean = context.getBean(Person.class);
		new Thread(()->{
			bean.setName("zhangsan");
			System.out.println(bean);
		}).start();
		
		Thread.sleep(1);
		new Thread(()->{
			bean.setName("lisi");
			System.out.println(bean);
		}).start();
	}
	
	@Test
	public void test2(){
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(MyConfig.class);
		UserService bean = context.getBean(UserService.class);
		new Thread(()->{
			String zhangsan = bean.chushu("zhangsan");
			System.out.println(zhangsan);
		}).start();
		
		new Thread(()->{
			String lisi = bean.chushu("lisi");
			System.out.println(lisi);
		}).start();
	}
	
	@Test
	public void test3(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		//MyBeanFactoryPostProcessor bean = context.getBean(MyBeanFactoryPostProcessor.class);
	}
	
	@Test
	public void test4(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FinishBean.class);
		FinishBean bean = context.getBean(FinishBean.class);
	}
	
	public void test5(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrderEvent.class);
		
		Order order =new Order();
		
		context.publishEvent(new OrderEvent(order, Clock.systemUTC()));
	}
}
