package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
	WebDriver bo;
	String Bpath="http://apps.qaplanet.in/hrm/login.php";
	
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() {
	  	bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		System.out.println("I asdmasdfjknaklsdfas asdf");
		
  }
  @Test(enabled=true,priority=2,groups="login")
  void testcase2(){
	//Testing Functionality of Logins for InValid TestCase with validUserID and Invalid Password
			
			bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
			bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("labb1");
			bo.findElement(By.xpath("//input[@name='Submit']")).click();
			Assert.assertEquals(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText(), "Invalid Login");
			
  }
 @BeforeMethod
  void buildexecution(){
	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
  }
 @AfterMethod
 void close(){
	 bo.close();
 }
}

