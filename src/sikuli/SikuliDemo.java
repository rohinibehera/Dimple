package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SikuliDemo {
	static WebDriver driver;

	static Screen s = new Screen();

	public static void main(String[] args) throws SikuliException    {


		s.click("D:\\LIB\\SikuliImages\\edze.PNG");
		s.click("D:\\LIB\\SikuliImages\\wifi.PNG");

		System.setProperty("webdriver.chrome.driver"  , "D:\\LIB\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumlearn.com/java");
		
		s.type("D:\\LIB\\SikuliImages\\search.PNG", "Java");

	}

}
