package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("anumeha.gupta.0331@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("1234");
		//driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
