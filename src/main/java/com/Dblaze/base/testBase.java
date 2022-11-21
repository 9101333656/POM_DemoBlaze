package com.Dblaze.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public testBase() {//it is a contractor
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\ridip.malakar\\Documents\\selenium\\meavenPro\\freeDemoBlazeTest\\src\\main\\java\\com\\Deblaze\\config\\config.properties");
			prop.load(ip);
		}catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
	
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ridip.malakar\\Documents\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("edge")) {
			//write edge path
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
