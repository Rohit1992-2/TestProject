package com.automationpractise.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMain {
public static WebDriver driver;
public static Properties prop;


	protected TestMain(){
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Simple_tst\\src\\main\\java\\com\\automationpractise\\config\\data.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
	

	
	}
	public  static void intialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\123\\Webdriver\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (browserName.equals("FireFox")) {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\admin\\\\Desktop\\\\123\\\\Webdriver\\\\chromedriver.exe");
		driver = new FirefoxDriver();
		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}
		
		
	}
	




