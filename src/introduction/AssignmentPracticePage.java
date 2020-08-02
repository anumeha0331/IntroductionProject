package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentPracticePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		String cb= driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		
		dropdown.selectByVisibleText(cb);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(cb);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String s= driver.switchTo().alert().getText();
		
		
		if (s.contains(cb))
		{
			System.out.println("alert message contains the value");
		}
		else
		{
			System.out.println("Alert message doesnot contain the value");
		}
		
		
	
		
	}

}
