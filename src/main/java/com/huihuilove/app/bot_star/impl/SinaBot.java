package com.huihuilove.app.bot_star.impl;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.huihuilove.app.bot_star.Bot;
@Component
public class SinaBot extends Bot{
	
	private static Logger logger = Logger.getLogger(SinaBot.class);
	private static ResourceBundle resourceBundle = ResourceBundle.getBundle("sina");
	
	public void login() {
		logger.info("登陆新浪");
		logger.info(resourceBundle.getString("rest.host"));
		status = LOGINING;
	}

}
