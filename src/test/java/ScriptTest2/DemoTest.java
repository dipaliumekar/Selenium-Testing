package ScriptTest2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoTest {
	
		static WebDriver driver;
	
		public WebDriver setup() {
		
			return driver = new ChromeDriver();
		}
		
		
	//Login functionality
		
	public void login() throws InterruptedException {
			
			 // email
			WebElement email = driver.findElement(By.name("Email"));
			email.sendKeys("dipa1@gmail.com");
			Thread.sleep(2000);
			
			//password
			WebElement pwd =  driver.findElement(By.name("Password"));
			pwd.sendKeys("test1234");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
		}
	
   //Add To Cart
	public void addToCart() throws InterruptedException {
		 driver.findElement(By.xpath("//ul[@class='top-menu']//a[normalize-space()='Computers']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Desktops")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.linkText("Shopping cart")).click();
        

		 // Verify the product in the cart
		 List<WebElement> cartProducts = driver.findElements(By.xpath("//span[@class='product-name']"));
		 boolean isProductAdded = false;

		 for (WebElement product : cartProducts) {
		     if (product.getText().equals("Build your own expensive computer")) {
		         isProductAdded = true;
		         break;
		     }
		 }

		 if (isProductAdded) {
		     System.out.println("Product successfully added to the cart.");
		 } else {
		     System.out.println("Product not found in the cart.");
		 }

		}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		DemoTest app = new DemoTest();
		driver = app.setup();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		
		app.login();
		app.addToCart();
	}

}
