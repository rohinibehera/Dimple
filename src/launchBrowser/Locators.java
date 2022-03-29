package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hyderabadreport.com/user");
		driver.findElement(By.id("edit-name")).sendKeys("rohini");
		driver.findElement(By.name("pass")).sendKeys("Manual@2022");
		//driver.findElement(By.className("form-submit")).click();
		driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("current_pass")).sendKeys("Manual@2022");
		driver.findElement(By.name("mail")).clear();
		driver.findElement(By.name("mail")).sendKeys("rohiniranjan5@gmail.com");
		driver.findElement(By.linkText("Photos")).click();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		

	}

}
