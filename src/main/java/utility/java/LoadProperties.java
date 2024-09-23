package utility.java;

import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public static String App_URl;
	public static String Browser;
	public static String Browsertwo;
	public static String Username;
	public static String Password;
	
	
	public  void propertiesread() {
	Properties prop = new Properties();
	try {
		prop.load(getClass().getResourceAsStream("/config.properties"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	LoadProperties.App_URl = prop.getProperty("APPURl");
	LoadProperties.Browser =prop.getProperty("browser");
	LoadProperties.Browsertwo =prop.getProperty("browsertwo");
	LoadProperties.Username =prop.getProperty("username");
	LoadProperties.Password =prop.getProperty("Password");
	
	

}
}