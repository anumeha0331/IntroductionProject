package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		try {
			Thread.sleep(60000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
  WebElement source= driver.findElement(By.id("fromCity"));
		source.click();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER); 
		 /* WebElement	destination=driver.findElement(By.id("//input[@id='toCity']"));
		 destination.clear();
		 destination.sendKeys("DEL");
		 destination.sendKeys(Keys.ARROW_DOWN);
		 destination.sendKeys(Keys.ARROW_DOWN);
		 destination.sendKeys(Keys.ARROW_DOWN);
		 destination.sendKeys(Keys.ENTER); */
			
	}
	
}
