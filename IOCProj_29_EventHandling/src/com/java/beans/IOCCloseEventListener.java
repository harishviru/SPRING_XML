package com.java.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IOCCloseEventListener implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("When IOC Close........!");
		
	}
}
