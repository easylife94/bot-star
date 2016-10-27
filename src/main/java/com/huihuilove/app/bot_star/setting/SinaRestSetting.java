package com.huihuilove.app.bot_star.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "rest",locations = "classpath:sina.properties")  
public class SinaRestSetting {
	

	/**
	 * 请求协议
	 */
	private String protocol;
	/**
	 * 主机地址
	 */
	private String host;
	/**
	 * 端口
	 */
	private String port;
	
	private String key;
	
	private String secret;
	
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}

	
}
