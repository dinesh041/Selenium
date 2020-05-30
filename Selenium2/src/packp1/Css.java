package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		//bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplantet1");
		//WebElement userid=bo.findElement(By.xpath("//input[@name='txtUserName']"));
		By userlocator=By.xpath("//input[@name='txtUserName']");
		WebElement UserID=bo.findElement(userlocator);
		UserID.sendKeys("qaplanet1");
		By pswrdlocator=By.xpath("//input[@name='txtPassword']");
		WebElement Pswrd=bo.findElement(pswrdlocator);
		Pswrd.sendKeys("lab1");
		By clickme=By.xpath("//input[@name='Submit']");
		WebElement login=bo.findElement(clickme);
		login.click();
		By logoutlocator=By.xpath("//a[contains(text(),'Logout')]");
		WebElement logout=bo.findElement(logoutlocator);
		logout.click();
		//WebElement uid=bo.findElement(By.xpath("//input[@name='txtUserName']"));
		//uid.sendKeys("qaplanet1");
		

	}

}
