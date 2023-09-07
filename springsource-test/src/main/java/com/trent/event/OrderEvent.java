package com.trent.event;


import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @Author: Trent
 * @Date: 2022/9/7 16:40
 * @program: spring
 * @Description:
 */
public class OrderEvent extends ApplicationEvent{
	
	
	public OrderEvent(Object source, Clock clock){
		super(source, clock);
	}
}
