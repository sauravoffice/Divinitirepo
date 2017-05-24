package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Readproperty {
Properties pro;
	public Readproperty() throws Exception{
		File file= new File("E:\\workspace\\com.divinitiautomation\\Configuration\\Config.properties");
		FileInputStream fin= new FileInputStream(file);
		pro= new Properties();
		pro.load(fin);
	}
	public String getapplicationurl(){
		String URL=pro.getProperty("url");
		return URL;
	}
	public String getchromepath(){
		String chromedriverpath= pro.getProperty("chromepath");
		return chromedriverpath;
	}
	public String getgeckopath(){
		String geckodriverpath=pro.getProperty("gekopath");
		return geckodriverpath;
	}
	
	}
