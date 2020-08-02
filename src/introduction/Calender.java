package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		driver.findElement(By.id("travel_date")).click();
		int count= driver.findElements(By.xpath("//td[@class='day']")).size();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.xpath("//td[@class='day']"));
		for(int i=0;i<count;i++)
		{
			String text= driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
			if (text.equalsIgnoreCase("22"))
			{
				driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
				break;
			}
		}
	}

}
