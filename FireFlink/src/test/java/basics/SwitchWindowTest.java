package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindowTest {

	
		// TODO Auto-generated method stub

	@Test
	public void test() {
		  WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.selenium.dev/");
	       driver.findElement(By.xpath("//i[@class='fab fa-github']")).click();
	       driver.findElement(By.xpath("//a[contains(.,' Sign in')]")).click();
	}

}
