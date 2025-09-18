package UserAuthentication;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Launch {
    WebDriver driver;
	public void setup() {
		//open browser
		//WebDriver driver =  new ChromeDriver();
		//WebDriver driver =  new FirefoxDriver();
		
		driver = new ChromeDriver();
	}
	
//	public void custom() {
//		driver.findElement(By.xpath("//label[text()='Custom']")).click();
//	}
//	public void male() {
//		driver.findElement(By.xpath("//label[text()='Male']")).click();
//	}
//	public void female() {
//		driver.findElement(By.xpath("//label[text()='Female']")).click();
//	}
	
//	public void allRadio() {
//		List<WebElement> allEle = driver.findElements(By.xpath("//input[@class='_8esa']"));
////		for(WebElement e: allEle) {
////			e.click();
////			
////		}
//		
//		for(int i = 0; i < allEle.size(); i++) {
//			allEle.get(i).click();
//			
//		}
//	}
	
	
	
	public void allLabel() throws InterruptedException {
		List<WebElement> allEle = driver.findElements(By.xpath("//label[@class='_58mt']"));
		for(WebElement e : allEle) {
			System.out.println("Female selected....");
			
			if(e.getText().equals("Female"))
			{
				e.click();
				Thread.sleep(1000);
				
			}
		}
//			String txt = allEle.get(i).getText();
//			System.out.println(txt);
//			allEle.get(i).click();
//			
		}
	
	
	public void dayTest() throws InterruptedException {
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(day);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("3");
		Thread.sleep(2000);
		select.selectByVisibleText("16");
	}
		
	public void monthTest() throws InterruptedException {
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(month);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("5");
		Thread.sleep(2000);
		select.selectByVisibleText("Jan");
		
	}
	
	public void yearTest() throws InterruptedException {
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select select = new Select(year);
		List<WebElement> options = select.getOptions();
		for(WebElement e : options) {
			String txt =  e.getText();
			select.selectByVisibleText(txt);
			Thread.sleep(300);
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Launch launch = new Launch();
		launch.setup();
		launch.driver.get("https://facebook.com/"); //main window
		launch.driver.findElement(By.linkText("Create new account")).click();
		
		
		
	try {	
		//username
//		WebElement uname = launch.driver.findElement(By.id("email"));
//		uname.sendKeys("u1@gmail.com");
//		//Thread.sleep(1000);
//		uname.clear();
		
		
		
		
		//password
//		WebElement pwd =  launch.driver.findElement(By.name("pass"));
//		pwd.sendKeys("test");
		
		
		
		//login
	 // launch.driver.findElement(By.partialLinkText("Forgotten password")).click();
		
//		 launch.driver.findElement(By.partialLinkText("Create new account")).click();
		 
		 
		 //first name
		 WebElement fname = launch.driver.findElement(By.name("firstname"));
		 fname.sendKeys("Shreya");
	     //surname
		 WebElement sname = launch.driver.findElement(By.name("lastname"));
		 sname.sendKeys("Bagade");
		 
		 // mobile number
		 WebElement mnum = launch.driver.findElement(By.name("reg_email__"));
		mnum.sendKeys("9076388943");
		
		//password
		WebElement pwd =  launch.driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("test");
		
//		launch.driver.findElement(By.id("privacy-link")).click();
//		
//		Thread.sleep(3000);
//		String mainid = launch.driver.getWindowHandle();//to get all window
//		System.out.println(mainid);
//		//give reference to current window
//		
//		
//		
//		Set<String> allwin = launch.driver.getWindowHandles();
//		System.out.println(allwin);
//		System.out.println(allwin.size());
//		
//		for(String e: allwin) {
//			
//			if(e.matches(mainid)) {
//			launch.driver.switchTo().window(e);
//			System.out.println("--------Parent-----------");
//			launch.driver.switchTo().window(e);			
//			String url = launch.driver.getCurrentUrl();//to get single window reference
//			String title = launch.driver.getTitle();
//			System.out.println(url + " " + title);
//			}
//			else {
//				System.out.println("-----------Child--------------");
//				launch.driver.switchTo().window(e);
//				launch.driver.findElement(By.linkText("Meta Products")).click();
//		
//			}
//		}
		//driver.close();  //windows associated with driver or webdriver get terminated
			
				//launch.driver.quit();
				
		//sign up
		//launch.driver.findElement(By.name("websubmit")).click();
//	    launch.male();
//	    Thread.sleep(3000);
//	    launch.female();
//	    Thread.sleep(3000);
//	    launch.custom();
//	    Thread.sleep(3000);
		//launch.allRadio();
		launch.dayTest();
		launch.monthTest();
		launch.yearTest();
		launch.allLabel();
		
		launch.driver.quit();
		
		
		
				
	  
	} catch(Exception e) {
		e.printStackTrace();
	}
		
	}

}
