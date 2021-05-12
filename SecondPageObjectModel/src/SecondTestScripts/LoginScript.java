package SecondTestScripts;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SecondPageObjects.SecondFBHomePageObjects;

public class LoginScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///log information 
		  Logger logger1 = Logger.getLogger(LoginScript.class);
		//browserpath
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		logger1.info("browser path is set");
		//browser instance
		WebDriver driver=new ChromeDriver();
		logger1.info("create browser instance");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize
		driver.manage().window().maximize();
		//open app
		driver.get("http://www.facebook.com");
		logger1.info("enter url");
        //intialize class name
		SecondFBHomePageObjects sfbpj=new SecondFBHomePageObjects(driver);
		logger1.warn("this is not support");
		
		///link count  
		 int linksCount  = driver.findElements(By.xpath("//a")).size();
		 
		 logger1.info("number of liks on the page  " + linksCount);
		 System.out.println(linksCount);
		 
		 
		 ///call from obj model 
		 int myLinks  = sfbpj.linksCount();
		 System.out.println("no of links are  " + myLinks);
		 logger1.info("this is from object model   and liks count and links are   " +myLinks);
		//enter email
		sfbpj.enterLoginEmailOnFBH("testing");
		logger1.warn("login email entereed");
		//enter pwd
		sfbpj.enterLoginPwdOnFBH("practice");
		logger1.debug("this is msg can't displayed");
		
		//click on create acc
		sfbpj.clickOnCreateAccOnFBH();
		logger1.warn("click on create acc");
		//enter first name
		sfbpj.enterFirstNameReg("vani");
		//enter last name
		sfbpj.enterLastNameReg("B");
		//enter reg email
		sfbpj.enterRegEmail("practice");
		//enter reg pwd
		sfbpj.enterRegpwd("testing");
		//select month
		sfbpj.selectbytext("Jun");
		//select day
		sfbpj.selectbyvalue("28");
		//select by year
		sfbpj.selectbytextyear("1989");
		//click on female button
		sfbpj.clickonfemalebutton();
	}

}
