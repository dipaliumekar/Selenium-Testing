package UserAuthentication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	
		static WebDriver driver;
		public WebDriver setup() {
			
			return driver = new ChromeDriver();
		}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			AmazonSearch tours = new AmazonSearch();
			driver = tours.setup();
			driver.get("https://www.amazon.in/");
			WebElement pro = driver.findElement(By.id("twotabsearchtextbox"));
			pro.sendKeys("Phone",Keys.ENTER);
			//driver.findElement(By.id("nav-search-submit-button")).click();
			
			driver.findElement(By.id("a-autoid-8-announce")).click();
			driver.findElement(By.id("a-autoid-7-announce")).click();
			driver.findElement(By.id("a-autoid-6-announce")).click();
			
			driver.findElement(By.id("nav-cart-count")).click();
			
			List<WebElement> product = driver.findElements(By.xpath("//ul/li[@class='sc-item-product-title-cont']//a//h4/span/span[2]"));
//			
//				
			for(WebElement e : product)
			{
				System.out.println(e.getText());
				if(e.getText().equals("Samsung Galaxy A55 5G (Awesome Iceblue, 8GB RAM, 128GB Storag…"))
				{
					Thread.sleep(10000);
					System.out.println("product successfully added.");
				}
			}
			driver.quit();
//			}
		
	

	}

 }

