package packp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver exe\\chromedriver.exe");
WebDriver bo=new ChromeDriver();
bo.get("http://apps.qaplanet.in/hrm/login.php");
String pt=bo.getTitle();
System.out.println(pt);
String url=bo.getCurrentUrl();
System.out.println(url);
String ps=bo.getPageSource();
System.out.println(ps);
bo.navigate().to("https://www.facebook.com/");
bo.navigate().back();
bo.navigate().forward();
bo.navigate().refresh();
bo.close();
	}

}
