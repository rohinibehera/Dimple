package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techlearn.in");
		JavascriptExecutor up = (JavascriptExecutor)driver;
		up.executeScript("scroll(0, 1500)");
		Thread.sleep(9000); 
		JavascriptExecutor down = (JavascriptExecutor)driver;
		down.executeScript("scroll(1500, 0)");

	}

}
