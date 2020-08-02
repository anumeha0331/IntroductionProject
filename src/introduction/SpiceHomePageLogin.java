package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SpiceHomePageLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		try {
			Thread.sleep(20000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		try {
			Thread.sleep(2000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
try {
	Thread.sleep(20000L);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//ACTIVE-DATE
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
try {
	Thread.sleep(20000L);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//CHECK-BOX
Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
//System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
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

//RADIO-BUTTON
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
// selecting "Passenger" Drop Down

try {
	Thread.sleep(60000L);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.id("divpaxinfo")).click();
	try {
	Thread.sleep(2000L);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();

driver.findElement(By.xpath("//option[@value='4']")).click();
driver.findElement(By.id("divpaxinfo")).click();

// submit "Search" button
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}
	
	}


