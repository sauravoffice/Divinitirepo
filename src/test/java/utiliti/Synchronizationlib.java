package utiliti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Synchronizationlib {
	static WebElement ele=null;
public static WebElement iselementpresent(WebDriver driver,String xpath,int time){
	for(int i=0;i<time;i++){
		try{
		ele=driver.findElement(By.xpath(xpath));
		break;
	}
		catch(Exception e)
		{

	try{
			Thread.sleep(2000);
		}catch(Exception e1){
			System.out.println("Exception handeled sucessfully");
		}
	}
		}
	return ele;
	
}
}
