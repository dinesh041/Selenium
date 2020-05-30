package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserNam  e']")).sendKeys("qaplanet1");
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

}
