package com.trent.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Trent
 * @Date: 2022/9/7 16:42
 * @program: spring
 * @Description:
 */
@Component
public class MsgEventListener{

	@EventListener(OrderEvent.class)
	public void onApplicationEvent(OrderEvent orderEvent){
		System.out.println("事件");
	}
}
