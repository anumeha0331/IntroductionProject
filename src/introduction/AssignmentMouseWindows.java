package introduction;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentMouseWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		System.out.println("click the Click Option to switch to child window");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		 String childid1=it.next();
		
		 driver.switchTo().window(childid1);
		System.out.println("print the text of child window");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(parentid);
		System.out.println("print the text of parent");
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
	}

}

