package com.huihuilove.app.bot_star;


public abstract class Bot {
	
	public static final int LOGINING = 1;//登陆
	public static final int LOGOUTED = 2;//登出

	protected int status;
	
	public abstract void login();

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
}
