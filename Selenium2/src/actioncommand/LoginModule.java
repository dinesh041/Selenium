package actioncommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginModule {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		Actions cr=new Actions(bo);
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		cr.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
		Thread.sleep(3000);
		cr.moveToElement(bo.findElement(By.xpath("//a[@class='l2_link parent skills']//span[contains(text(),'Skills')]"))).perform();
		Thread.sleep(3000);
		cr.moveToElement(bo.findElement(By.xpath("//a[@class='skills']//span[contains(text(),'Skills')]"))).perform();
		bo.findElement(By.xpath("//a[@class='skills']//span[contains(text(),'Skills')]")).click();

	}

}
