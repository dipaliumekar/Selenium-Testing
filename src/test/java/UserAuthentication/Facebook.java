package UserAuthentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook {
	
	
	static WebDriver driver;
	
	public WebDriver setup() {
	
		return driver = new ChromeDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facebook fb = new Facebook();
		driver = fb.setup();
		driver.get("https://facebook.com/");


	}

}
