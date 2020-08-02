package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		int rowcount=table.findElements(By.tagName("tr")).size();
		System.out.println(rowcount);
		int column= table.findElements(By.tagName("th")).size();
		System.out.println(column);
		String value1 = table.findElement(By.xpath("//tr[3]//td[1]")).getText();
		System.out.println(value1);
		String value2 = table.findElement(By.xpath("//tr[3]//td[2]")).getText();
		String value3 = table.findElement(By.xpath("//tr[3]//td[3]")).getText();
		System.out.println(value2);
		System.out.println(value3);
	}

}
