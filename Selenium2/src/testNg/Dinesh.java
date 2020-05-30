package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dinesh {
  @Test
  public void Testcase1() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		//String pt=bo.getTitle();
		//System.out.println(pt);
		if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Pass ValidTestCase1 for logins");
			
	}
		else {
		System.out.println("Fail ValidTestCase1 for logins");
		}
	bo.close();
  }
}
