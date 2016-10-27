package com.huihuilove.app.bot_star.rest.impl;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.huihuilove.app.bot_star.rest.Rest;
@Component
public class SinaRest implements Rest {
	private static Logger logger = Logger.getLogger(SinaRest.class);
	private static ResourceBundle rb = ResourceBundle.getBundle("sina");
	
	private static final String PROTOCOL;
	private static final String HOST;
	private static final String PORT;
	private static final String KEY;
	private static final String SECRET;
	
	static{
		PROTOCOL 	= rb.getString("rest.protocol");
		HOST 		= rb.getString("rest.host");
		PORT 		= rb.getString("rest.port");
		KEY 		= rb.getString("rest.key");
		SECRET 		= rb.getString("rest.secret");
	}
	
	public void OAuth() {
		
		 
		
	}
}
