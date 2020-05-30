package general;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver_win321\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.redbus.in/");
		List<WebElement> we=bo.findElements(By.tagName("a"));
		System.out.println(we.size());
		
		for(int i=0; i<=we.size();i++ ) 
		{
	
	System.out.println(we.get(i).getText());
	}
		
		
	}

}
