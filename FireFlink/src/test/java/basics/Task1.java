package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       driver.findElement(By.xpath("//i[@class='fab fa-github']")).click();
       driver.findElement(By.xpath("//a[contains(.,' Sign in')]")).click();
       
	}

}
