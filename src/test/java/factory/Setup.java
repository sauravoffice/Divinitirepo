package factory;

import org.openqa.selenium.WebDriver;
public class Setup {
	static WebDriver driver;
	public static WebDriver setupconfig() throws Exception {
		driver=Browserfactory.selectbrowser("firefox");
			driver.get(Dataproviderfactory.getproperty().getapplicationurl());
			return driver;
			}
	}

