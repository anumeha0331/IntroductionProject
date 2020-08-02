package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qaclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify");
		//traverse sibling
		driver.findElement(By.xpath(".//*[@id='did_submit']/following-sibling::a")).click();
		//traverse from child to parent
		driver.findElement(By.xpath(".//*[@id='did_submit']/parent::div"));
	}

}
