package packp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.facebook.com//");
		bo.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Dinesh");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("M");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("0415877166");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("password");
		Thread.sleep(3000);
		bo.findElement(By.xpath("//input[@id='u_0_7']")).click();
		Thread.sleep(5000);
		bo.close();
		
		
		

	}

}
