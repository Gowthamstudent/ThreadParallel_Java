package utility.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverclass extends Base_Class {
	
	public Driverclass(WebDriver driver) {
		this.driver= driver;
	}
	
public void driverin(String browser) {
		
		LoadProperties Lp = new LoadProperties();
		Lp.propertiesread();
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver =new FirefoxDriver();
		}

}
}