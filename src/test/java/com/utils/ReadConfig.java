package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("C:\\Users\\HP\\eclipse-workspace\\InternetBanking\\configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getapp() {
		String property = pro.getProperty("baseurl");
		return property;

	}

	public String getusername() {
		String username = pro.getProperty("username");
		return username;

	}

	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}

}
