package UserAuthentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {
	static WebDriver driver;
	public WebDriver setup() {
		//open browser
		//WebDriver driver =  new ChromeDriver();
		//WebDriver driver =  new FirefoxDriver();
		
		return driver = new ChromeDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		NewTours tours = new NewTours();
		driver = tours.setup();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("password")).click();
		
		//usename
		WebElement uname = driver.findElement(By.name("userName"));
		uname.sendKeys("mercury");
		Thread.sleep(1000);
		uname.clear();
		
		//pwd
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("mercury");
		
		//login
		driver.findElement(By.name("submit")).click();
		
		

	}

}
