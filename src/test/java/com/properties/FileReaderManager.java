package com.properties;

import java.io.IOException;

public class FileReaderManager {
	

	public static FileReaderManager getInstancesall() {
		FileReaderManager fm= new FileReaderManager();
		return fm;
	}
	
	public static ConfigurationReader getInstancescon() throws IOException {
		ConfigurationReader cr= new ConfigurationReader();
		return cr;
	}

}
