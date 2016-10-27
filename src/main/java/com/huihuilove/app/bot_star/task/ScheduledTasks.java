package com.huihuilove.app.bot_star.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.huihuilove.app.bot_star.Bot;

@Component
@Configurable
@EnableScheduling
public class ScheduledTasks{
	private static Logger logger = Logger.getLogger(ScheduledTasks.class);
	@Autowired Bot bot;
	
	
	//时间间隔 1000 * 30 = 
 /*   @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
        
    	bot.login();
    	logger.info("状态："+bot.getStatus());
    }*/

    //每1分钟执行一次
    @Scheduled(cron = "0 */1 *  * * * ")
    public void reportCurrentByCron(){
    	if(bot.getStatus() != Bot.LOGINING){
    		bot.login();
    	}
        logger.info("登陆状态："+bot.getStatus());
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
    
}