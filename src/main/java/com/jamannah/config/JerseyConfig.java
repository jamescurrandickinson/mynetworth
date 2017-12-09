package com.jamannah.config;

import com.jamannah.controller.MyNetWorthRestController;
import org.glassfish.jersey.server.ResourceConfig;

import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(MyNetWorthRestController.class);
	}

}