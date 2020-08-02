package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		Actions actions = new Actions(driver);
		//Retrieve WebElement 'shops' to perform mouse hover 
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		WebElement shopByCategory= driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		
		actions.moveToElement(shopByCategory).perform();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//performing click operation on "bakery" option:
		driver.findElement(By.xpath("//ul[@id='navBarMegaNav']//a[@class='ng-binding'][contains(text(),'Bakery, Cakes & Dairy')]")).click();
	}

}
