package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		//bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		//bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		//bo.findElement(By.name("Submit")).click();
		//bo.findElement(By.partialLinkText("Log")).click();
		bo.findElement(By.cssSelector("input[name=txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.cssSelector("input.loginText[name=txtPassword]")).sendKeys("lab1");

	}

}
