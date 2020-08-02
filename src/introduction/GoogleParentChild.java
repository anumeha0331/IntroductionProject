package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//for search bar
		driver.findElement(By.xpath("//div[@id='ntp-contents']/div[2]/div/input")).click();
//for image link
driver.findElement(By.xpath("//div[@id='one-google']/header/div[2]/div[3]/div/div/div[2]/a")).click();
	
	}

}
