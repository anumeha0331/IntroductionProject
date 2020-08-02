package introduction;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class WindowHandlingOpenFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.linkText("Select PDF files")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Runtime.getRuntime().exec("C:\\Users\\Ajay\\Documents\\EditorScript\\FileUpload.exe");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(5000);
		File f=new File(downloadPath+"/converted.zip");
		if(f.exists())
		{
		System.out.println("file exists");
		//if(f.delete())
		//System.out.println("file deleted");

		}




		}

		

	}


//toolpage lang-en-US sidebar-active tool-pdfjpg
//pickfiles