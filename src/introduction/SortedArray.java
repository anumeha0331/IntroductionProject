package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to check whether the list is in descending order
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		List<WebElement> firstColList= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList<String> originallist= new ArrayList<String>();
		for(int i=0; i<firstColList.size();i++)
		{
			originallist.add((firstColList).get(i).getText());
			
		}
		ArrayList<String> copiedlist= new ArrayList<String>();
		for(int i=0; i<originallist.size();i++)
		{
			copiedlist.add((originallist).get(i));
			
		}
		
		
		System.out.println("original list is:");
		for(String s :originallist)
		{
			System.out.println(s);
		}
		Collections.sort(copiedlist);
		Collections.reverse(copiedlist);
		System.out.println("copied list is in descending order:");
		for(String s :copiedlist)
		{
			System.out.println(s);
		}
		Assert.assertTrue(originallist.equals(copiedlist));
		
		
	}

}
