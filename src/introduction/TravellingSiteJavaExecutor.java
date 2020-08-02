package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravellingSiteJavaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String s= "return document.getElementByid(\"fromPlaceName\").value;"; 
		String text = (String) js.executeScript(s);
		System.out.println(s);
		int i =0;
		while(!s.equalsIgnoreCase("Airport"))
		{
			i++;
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		text = (String) js.executeScript(s);
		System.out.println(text);
		if (i>10)
		{
			break;
		}
		
		}
		
		if (i>10)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("element found");
		}
		
	}

}
