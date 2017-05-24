package testcase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import factory.Setup;

public class verifyhomepage extends Setup {
	WebDriver driver;
@BeforeClass
public void before() throws Exception{
		driver=setupconfig();
		Reporter.log("Browser is launched and url is passed ", true);
	}
@Test(priority=0)
	public void verify() throws InterruptedException{
	String actualtitle=	driver.getTitle();
	Reporter.log("Title of the page is fetched", true);
	System.out.println("Actual title of the page is "+actualtitle);
	Assert.assertTrue(actualtitle.contains("Online Gift Shop"));
	}
@AfterMethod
public void after(){
	driver.quit();
}
}
