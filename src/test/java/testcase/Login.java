package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.Setup;
import pageobjects.Loginpageobject;

public class Login extends Setup{
	WebDriver driver;
	Loginpageobject obj;
	@BeforeClass
	public void before() throws Exception {
	driver=setupconfig();
	}
	@Test(priority=0)
public void login(){
	obj=new Loginpageobject(driver);
	obj=PageFactory.initElements(driver, Loginpageobject.class);
	obj.logintosite();
}
	@Test(priority=1,dataProvider="loginarray",dataProviderClass=Loginpageobject.class)
	public void passcredentials(String email,String pass){
		obj=new Loginpageobject(driver);
		obj=PageFactory.initElements(driver, Loginpageobject.class);
		obj.loginToaccount(email, pass);
	}
	@Test(priority=2,dataProviderClass=Loginpageobject.class)
	public void logintoacc(){
		obj=new Loginpageobject(driver);
		obj=PageFactory.initElements(driver, Loginpageobject.class);
		obj.submitdetails();
	}
	/*@AfterMethod
	public void after(){
		driver.quit();
	}*/
}
