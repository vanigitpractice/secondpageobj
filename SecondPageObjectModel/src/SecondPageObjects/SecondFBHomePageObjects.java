package SecondPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondFBHomePageObjects {
	
	public  static WebDriver driver; 
	
	///homepage object  
	///login objects  
	
	///login email  
	By objLoginEmail = By.name("email");
	
	///login pwd  
	By objLoginPwd = By.name("pass");
	
	///login button  
	
	
	////create account  
	By  objCreateAcc = By.linkText("Create New Account");
	
	///////firstname  
	By  objFirstName  = By.name("firstname");
	
	//lastname
	By objlastname=By.name("lastname");
	//reg email
	By objregemail=By.name("reg_email__");
	//reg pwd
	By objregpwd=By.name("reg_passwd__");
	//month
	By objmonth=By.name("birthday_month");
	//day
	By objday=By.name("birthday_day");
	//year
	By objyear=By.name("birthday_year");
	//female button
	By objfemale=By.xpath("//input[@value='1']");
	
	
	
	
	
	///constructor
	
	public  SecondFBHomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	///object  methods
	
	///enter login email  
	 public void  enterLoginEmailOnFBH(String myLoginE)
	 {
		 driver.findElement(objLoginEmail).sendKeys(myLoginE);
	 }
	 
	 ///login pwd  
	 public void  enterLoginPwdOnFBH(String myLoginP)
	 {
		 driver.findElement(objLoginPwd).sendKeys(myLoginP);
	 }
	 
	 
	 ///click on create new account  
	 public void clickOnCreateAccOnFBH()
	 {
		 driver.findElement(objCreateAcc).click();
	 }
	 
	 
	 
	 ///enter  first name
	 public void enterFirstNameReg(String myFName)
	 {
		 driver.findElement(objFirstName).sendKeys(myFName);
	 }
	//enter lastname
	 public void enterLastNameReg(String mylname)
	 {
		 driver.findElement(objlastname).sendKeys(mylname);
	 }
	 //enter reg email
	 public void enterRegEmail(String myemail)
	 {
		 driver.findElement(objregemail).sendKeys(myemail);
	 }
	//enter reg pwd
	 public void enterRegpwd(String mypwd)
	 {
		 driver.findElement(objregpwd).sendKeys(mypwd);
	 }
	 //select month
	 public void selectbytext(String month)
	 {		 
		 Select monthselect= new Select(driver.findElement(objmonth));
		 monthselect.selectByVisibleText(month);
	 }
	//select day
	 public void selectbyvalue(String day)
	 {
		 Select dayselect=new Select(driver.findElement(objday));
		 dayselect.selectByValue(day);
	 }
	//select year
	 public void selectbytextyear(String year)
	 {
		 Select yearselect=new Select(driver.findElement(objyear));
		 yearselect.selectByVisibleText(year);
	 }
	 //click on female button
	 public void clickonfemalebutton()
	 {
		 driver.findElement(objfemale).click();
	 }
	
	 
	 ///link count  
	 public int linksCount()
	 {
		 return driver.findElements(By.xpath("//a")).size();
	 }
	
	

}
