package com.bdd.qa.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class DataPropReader {
public static Properties initalizeDataPropertiesFile() throws Exception {
		
		Properties dataprop = new Properties();
		FileInputStream dp = new FileInputStream("C:\\Users\\ezins\\eclipse-workspace-new\\BootCamp_BDD_Cucumber_FrameWork\\src\\test\\resources\\properties_files\\dataprop.properties");
		dataprop.load(dp);
		
		
		 return dataprop;
	}
}