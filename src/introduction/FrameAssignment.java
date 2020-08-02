package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		//switch to first frame
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		//switch to second frame
				driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
