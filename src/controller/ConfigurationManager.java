package controller;

import com.prutzkow.resourcer.*;

public class ConfigurationManager {
	private final static Resourcer resource = ProjectResourcer.getInstance();

	// класс извлекает информацию из файла config.properties
	private ConfigurationManager() {
	}

	public static String getProperty(String key) {
		System.out.print(key);
		return resource.getString(key);

	}
}
