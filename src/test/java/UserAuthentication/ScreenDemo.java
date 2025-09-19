package UserAuthentication;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenDemo {
	
static WebDriver driver;
	
	public WebDriver setup() {
	
		return driver = new ChromeDriver();
		
	}
    
	
	public void captureScreenshot() throws IOException {
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String time = df.format(date);
		
		File dest =  new File("src\\test\\java\\UserAuthentication\\img"+time+".png");
		
		FileUtils.copyFile(x, dest);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ScreenDemo screen = new ScreenDemo();
		driver = screen.setup();
		try{
		driver.get("https://ksrtc.in/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		
		
		//for scrolling the page
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scroll(0,+500)");
		screen.captureScreenshot();
		
		Thread.sleep(2000);

		//find Search buses button
		driver.findElement(By.xpath("//div[@id='submitSearch']")).click();
		Thread.sleep(2000);
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		if(txt.matches("Please select start place."))
		{
			System.out.println("Valid alert...");
			driver.switchTo().alert().accept(); //ok
			
		}
		else {
			System.out.println("Invalid alert...");
			driver.switchTo().alert().dismiss(); //cancel
			screen.captureScreenshot();
			
		}
		
		
		
		
		//screenshot
		//screen.captureScreenshot();
		
		
		//driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
