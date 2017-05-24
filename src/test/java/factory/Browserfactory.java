package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	static WebDriver driver;
	public static WebDriver selectbrowser(String browser) throws Exception{
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",Dataproviderfactory.getproperty().getgeckopath());
			driver= new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", Dataproviderfactory.getproperty().getchromepath());
			driver= new ChromeDriver();
		}
		return driver;
		
	}

}
