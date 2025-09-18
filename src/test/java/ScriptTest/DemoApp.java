package ScriptTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class DemoApp {
	
	static WebDriver driver;
		
	public WebDriver setup() {
		
		return driver = new ChromeDriver();
	}
	public void allLabel() throws InterruptedException {
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='gender']"));
		for(WebElement e : allEle) {
			System.out.println("Female selected....");
			
			if(e.getText().equals("Female"))
			{
				e.click();
				Thread.sleep(1000);
				
			}
		}
	}
   
	public void register() {
		
		 //first name
		 WebElement fname = driver.findElement(By.name("FirstName"));
		 fname.sendKeys("Dipali");
	     //surname
		 WebElement lname = driver.findElement(By.name("LastName"));
		 lname.sendKeys("Umekar");
		 
		 // email
		 WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("dipa@gmail.com");
		
		//password
		WebElement pwd =  driver.findElement(By.name("Password"));
		pwd.sendKeys("test123");
		
		WebElement cpwd =  driver.findElement(By.name("ConfirmPassword"));
		cpwd.sendKeys("test123");
		
		driver.findElement(By.id("register-button")).click();
		
	}
	public void addToCart() throws InterruptedException {
		 driver.findElement(By.linkText("Books")).click();
		 driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
         Thread.sleep(1000);
        // driver.findElement(By.linkText("Shopping cart")).click();
         List<WebElement> product = driver.findElements(By.xpath("//span[@class='cart-qty']"));
         for(WebElement e : product)
			{
				System.out.println(e.getText());
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoApp app = new DemoApp();
		driver = app.setup();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		try {
			
			
		//-------------------user registration-------------------------------------------------------------
			
		/*app.allLabel();
		 //first name
		 WebElement fname = driver.findElement(By.name("FirstName"));
		 fname.sendKeys("Dipali");
	     //surname
		 WebElement lname = driver.findElement(By.name("LastName"));
		 lname.sendKeys("Umekar");
		 
		 // email
		 WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("dipa1@gmail.com");
		
		//password
		WebElement pwd =  driver.findElement(By.name("Password"));
		pwd.sendKeys("test1234");
		
		WebElement cpwd =  driver.findElement(By.name("ConfirmPassword"));
		cpwd.sendKeys("test123");
		
		driver.findElement(By.id("register-button")).click();
		*/
			
	     //app.register();		
			
			
			//-------------------------Product add to cart------------------------------------------------
//			 driver.findElement(By.linkText("Books")).click();
//			 driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
//	         Thread.sleep(1000);
//	         driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
//	         Thread.sleep(1000);
//	        // driver.findElement(By.linkText("Shopping cart")).click();
//	         List<WebElement> product = driver.findElements(By.xpath("//span[@class='cart-qty']"));
//	         for(WebElement e : product)
//				{
//					System.out.println(e.getText());
//				}
	     app.addToCart();
	}
		catch(Exception e) {
			e.printStackTrace();
		}

 }
	
}
