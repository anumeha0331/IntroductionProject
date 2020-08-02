import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {
	 
	  public static final String USERNAME = "anumeha0331";
	  public static final String ACCESS_KEY = "1841b8d9-54c7-4272-832d-1d89f4809307";
	  public static final String URL = "http://" + USERNAME + ":" +ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		/*MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "Windows 7");
		browserOptions.setCapability("browserVersion", "51.0");
		browserOptions.setCapability("sauce:options", sauceOptions);*/
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 7");
		caps.setCapability("version", "51.0");
		
		WebDriver driver= new RemoteWebDriver(new java.net.URL(URL),caps);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
