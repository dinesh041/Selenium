package framework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModule {
	WebDriver bo;
	String Bpath="http://apps.qaplanet.in/hrm/login.php";
	
//Testing Functionality of Logins for Valid TestCase with validUserID and valid pswrd
	void testcase1(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
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
	//Testing Functionality of Logins for InValid TestCase with validUserID and invalid pswrd
	void testcase2(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Pass ValidTestCase2 for logins");
		}
		else
		{
			System.out.println("Fail ValidTestCase2 for logins");
		}
		bo.close();
	}
	//Testing Functionality of Logins for InValid TestCase with validUserID and invalid pswrd
	void testcase3(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet123");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String txt=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		//String txt=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(txt);
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
			
		System.out.println("Pass Invalid TestCase for logins");
			
		}
		else {
		System.out.println("Fail Invalid TestCase for logins");
		}
		bo.close();
	}
	//
	void testcase4(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab21");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String il=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(il);
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Login Successful")) {
			
		System.out.println("Pass Invalid TestCase for logins");
			
		}
		else {
		System.out.println("Fail Invalid TestCase for logins");
		}
		bo.close();
	}
	//Testing Functionality of Logins for InValid TestCase with validUserID and invalid pswrd
	void testcase5(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab2hj1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		String il=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(il);
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText().equals("Invalid Login")) {
			
		System.out.println("Pass");
			
		}
		else {
		System.out.println("Fail");
		}
		bo.close();
	}
}
