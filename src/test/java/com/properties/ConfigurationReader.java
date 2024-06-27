package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties pt;
	
	public ConfigurationReader() throws IOException{
		File fr= new File("C:\\Users\\Admin\\eclipse-workspace\\NewCucumberProject\\src\\test\\java\\com\\properties\\login.properties");
		FileInputStream fs= new FileInputStream(fr);
		pt= new Properties();
		pt.load(fs);
	}
	
	public static String getbrow() {
		String bw = pt.getProperty("browser");
		return bw;
	}
	
	public static String geturls() {
		String ur=pt.getProperty("url");
		return ur;
	}
	
	public static String getdecurl() {
		String da=pt.getProperty("urls");
		return da;
	}
	
}
