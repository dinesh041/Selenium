package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidtstcasepswrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
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
