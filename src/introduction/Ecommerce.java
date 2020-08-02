package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded= {"Brocolli","Cauliflower"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		try {
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		additems(driver,itemsNeeded);

	}
public static void additems( WebDriver driver,String[] itemsNeeded)
{
	int j=0;
	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0; i<products.size();i++)
	{
		
		String[] name=products.get(i).getText().split(" -");
		String formatedName=name[0].trim();
		//convert array into arraylist
		 List itemsNeededList= Arrays.asList(itemsNeeded); 
		if(itemsNeededList.contains(formatedName))
				{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
			if(j==itemsNeeded.length)
			{break;}
		}
	}
}
}
