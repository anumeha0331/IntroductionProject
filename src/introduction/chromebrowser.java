package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//driver.findElement(By.id("email")).sendKeys("anumeha.gupta.0331@gmail.com");
		driver.findElement(By.cssSelector( 
			"input#email.inputtext.login_form_input_box")).sendKeys("anumeha");
		driver.findElement(By.id("pass")).sendKeys("1234");
		//driver.findElement(By.id("u_0_b")).click();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	}
	

}
