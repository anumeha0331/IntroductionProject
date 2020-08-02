package introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("parent window");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[id='gb_70']")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String child=it.next();
		
		 System.out.println("childwindow");
		 driver.switchTo().window(child);
		 System.out.println(driver.getTitle()); 
		 
		 
				
		 }
	           
	}


