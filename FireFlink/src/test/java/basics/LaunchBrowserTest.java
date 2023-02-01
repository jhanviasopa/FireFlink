package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserTest {
@Test
public void launch()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/");
	 String Parentwindow = driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.selenium.dev/");
	driver.switchTo().window(Parentwindow);
	driver.manage().window().maximize();
	driver.manage().window().minimize();

}
}
