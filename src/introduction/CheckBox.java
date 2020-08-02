package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
	Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();	
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println("date is enabeled");
	Assert.assertTrue(true);
	}
	
	else {
		Assert.assertFalse(false);
	} 

}
}
//ctl00_mainContent_chk_SeniorCitizenDiscount
