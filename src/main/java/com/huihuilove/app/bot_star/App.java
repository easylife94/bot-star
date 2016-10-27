package com.huihuilove.app.bot_star;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.huihuilove.app.bot_star.setting.SinaRestSetting;


@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties({SinaRestSetting.class})
public class App {
	private static Logger logger = Logger.getLogger(App.class);
	
	
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    	
    	
    	logger.info("启动机器人");
    	
    	
    	
    	
    	
    }

    
    
}
