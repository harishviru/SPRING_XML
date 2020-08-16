package com.java.beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IOCStartUpEventListener implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("IOC StartUp...........!");
		
	}

}
