package com.trent.creantebeanfinish;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/5 18:08
 * @program: spring
 * @Description:
 */
@Component
public class RefreshedEventListener{

	@EventListener(ContextRefreshedEvent.class)
	public void listener(ContextRefreshedEvent contextRefreshedEvent){
		System.out.println("ContextRefreshedEvent....................");
	}

}
