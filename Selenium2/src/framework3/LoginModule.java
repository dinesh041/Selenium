package framework3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginModule {
	WebDriver bo;
	String Bpath="http://apps.qaplanet.in/hrm/login.php";
	
//Testing Functionality of Logins for Valid TestCase with validUserID and valid password
	void testcase1(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Pass ValidTestCase1 for logins");
			
	}
		else {
		System.out.println("Fail ValidTestCase1 for logins");
		}
	bo.close();
	}
//Testing Functionality of Logins for InValid TestCase with validUserID and Invalid Password
	void testcase2(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("labb1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Fail InValidTestCase1 with ValidID and InvalidPswrd");
			
	}
		else {
		System.out.println("Pass InValidTestCase1 with ValidID and InvalidPswrd");
		}
	bo.close();
	}
	//Testing Functionality of Logins for InValid TestCase with InvalidUserID and valid Password
	
	void testcase3(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet2221");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("Fail InValidTestCase2 with InvalidID and ValidPswrd");
			
	}
		else {
		System.out.println("Pass InValidTestCase2 with InvalidID and ValidPswrd");
		}
	bo.close();
	}
	//Testing Functionality of Logins for InValid TestCase with InvalidUserID and Invalid Password
	void testcase4(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet2221");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("labb1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		if(bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).equals("Invalid Login")) {
		System.out.println("Fail InValidTestCase4 with InvalidID and InValidPswrd");
			
	}
		else {
		System.out.println("Pass InValidTestCase4 with InvalidID and InValidPswrd");
		}
	bo.close();
	}
//Testing Functionality of Logins for InValid TestCase with Blank UserID and Blank Password
	
	void testcase5(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.switchTo().alert().accept(); 
		bo.close();
	}
	//Testing Functionality for Logout
	void testcase6(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		if(bo.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Pass for Logout");
		}
		else {
			System.out.println("Fail for Logout");
		}
		bo.close();
	}
	void testcase7(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		bo=new ChromeDriver();
		bo.get(Bpath);
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		bo.findElement(By.xpath("//a[contains(text(),'Change Password')]")).click();
		if(bo.getTitle().equals("OrangeHRM")) {
			System.out.println("Pass for Change Password");
		}
		else {
			System.out.println("Fail for Change Password");
		}
		bo.close();
	}
}
