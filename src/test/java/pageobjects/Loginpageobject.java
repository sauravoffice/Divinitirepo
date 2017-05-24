package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import factory.Dataproviderfactory;
public class Loginpageobject {
	WebDriver driver;
	@FindBy(xpath="//ul[@class='links pull-right']/li[@class='ht_login']")
	public WebElement login;
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="pass")
	public WebElement password;
	@FindBy(xpath=".//*[@id='send2'][@type='submit']")
	public WebElement submit;
	public Loginpageobject(WebDriver driver){
		this.driver=driver;
	}
	public void logintosite(){
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOf(login));
		if(login.isDisplayed()){
			if(login.isEnabled()){
				login.click();	
			}
		}
	}
	public void emailidpass(String emailcred){
		WebDriverWait wait= new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOf(email));
		if(email.isDisplayed()){
			if(email.isEnabled()){
				email.sendKeys(emailcred);
			}
		}
	}
	public void passwordpass(String passwordcred){
		WebDriverWait wait= new WebDriverWait(driver,200);
		wait.until(ExpectedConditions.visibilityOf(password));
		if(password.isDisplayed()){
			if(password.isEnabled()){
				password.sendKeys(passwordcred);
			}
		}
	}
	public void loginToaccount(String emailid,String passwordid){
		emailidpass(emailid);
		passwordpass(passwordid);
	}
	public void submitdetails(){
		WebDriverWait wait= new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		if(submit.isDisplayed()){
			if(submit.isEnabled()){
				submit.click();
			}
		}
	}
	@DataProvider(name="loginarray")
	public static Object[][] data() throws Exception{
		int rows=Dataproviderfactory.getExcel().getlastrownum(0);
		System.out.println("Number of row we are getting from the excel is "+rows);
		Object[][] datafeed= new Object[rows][2];
		for(int i=0;i<rows;i++){
			datafeed[i][0]=Dataproviderfactory.getExcel().getcellvalue(0,1,i);
			datafeed[i][1]=Dataproviderfactory.getExcel().getcellvalue(0,2,i);
		}
		return datafeed;

	}

}
