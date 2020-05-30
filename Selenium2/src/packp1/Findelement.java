package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		By useridlocator;
		WebElement userid;
		By pswrdlocator;
		WebElement pswrd;
		By Submitbutton;
		WebElement submit;
		By Logoutbutton;
		WebElement Logout;
		By checkbox;
		WebElement check;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		useridlocator=By.xpath("//input[@name='txtUserName']");
		userid=bo.findElement(useridlocator);
		userid.sendKeys("qaplanet1");
		pswrdlocator=By.xpath("//input[@name='txtPassword']");
		pswrd=bo.findElement(pswrdlocator);
		pswrd.sendKeys("lab1");
		Submitbutton=By.xpath("//input[@name='Submit']");
		submit=bo.findElement(Submitbutton);
		submit.click();
		Thread.sleep(3000);
		bo.switchTo().frame("rightMenu");
		Thread.sleep(3000);
		checkbox=By.xpath("//tr[@class='odd']//input[@name='chkLocID[]");
		check=bo.findElement(checkbox);
		check.click();
		Thread.sleep(3000);
		Logoutbutton=By.xpath("//a[contains(text(),'Logout')]");
		Logout=bo.findElement(Logoutbutton);
		Thread.sleep(3000);
		Logout.click();
		
		
	}

}
