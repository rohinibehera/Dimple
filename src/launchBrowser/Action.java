package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumlearn.com");
		/* Actions act=new Actions(driver);

	          act.moveToElement(driver.findElement(By.className("sf-depth-2"))).build().perform();
	          Thread.sleep(3000);
	          act.moveToElement(driver.findElement(By.linkText("Selenium Training"))).click().perform();*/
		
		 driver.get("http://www.seleniumlearn.com/double-click");
		    Thread.sleep(9000);
		    Actions act = new Actions(driver);
		    act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();


	}     
}
