package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	public static String getData(String key) throws IOException {
		// create File class object
		File file = new File("C:\\Users\\bgyan\\Desktop\\TestData.properties");

		// create FileReader class object
		FileReader reader = new FileReader(file);

		// create properties class object
		Properties prop = new Properties();

		// Load properties file
		prop.load(reader);
		// Call getValue()
		return (String) prop.get(key);
	}

}
