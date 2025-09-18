package UserAuthentication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	static WebDriver driver;
	public WebDriver setup() {
		
		return driver = new ChromeDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Amazon tours = new Amazon();
		driver = tours.setup();
		driver.get("https://www.amazon.in/");
/*		List<WebElement> allele =  driver.findElements(By.tagName("img"));
		System.out.println(allele.size());
		
		
		for(int i=0; i < allele.size(); i++) {
			String txt = allele.get(i).getText();
			System.out.println(txt);
		}
	*/
		/*List<WebElement> allele =  driver.findElements(By.tagName("a"));
		System.out.println(allele.size());
		
		
		for(int i=0; i < allele.size(); i++) {
			String txt = allele.get(i).getText();
			System.out.println(txt);
		}
		*/
		List<WebElement> allele =  driver.findElements(By.tagName("button"));
		System.out.println(allele.size());
		
		
//		for(int i=0; i < allele.size(); i++) {
//			String txt = allele.get(i).getText();
//			System.out.println(txt);
//		}
		for(WebElement e : allele) {
			
			System.out.println(e.getText());
			
		}
//		
		
		

	}
}
