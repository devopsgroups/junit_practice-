package com.framework.ap;

import java.io.InputStream;
import java.util.Properties;

public class LoadORFile {
	
	private String browser;
	private Properties props;
	
	
	public LoadORFile(String browser) {
		props = new Properties();
		this.browser = browser;
	}
	
	public synchronized Properties loadfromfile() {
		InputStream input = null;
		String path = null;
		try {
			path = getfilePath(browser);
			input = this.getClass().getClassLoader().getResourceAsStream(path);
			this.props.load(input);
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e2) {
					
				}
			}
		}
		return this.props;
	}
	
	
	
	
	public String getfilePath(String browser ) {
		switch (browser) {

		case "IE":
			return "properties/IEOR.Properties";
		case "Chrome":
			return "properties/ChromeOR.properties";
		case "Firefox":
			return "properties/FirefoxOR.properties";
		default:
			break;
		}
		return null;

	}

}
