package introduction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table1=driver.findElement(By.cssSelector("[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count= table1.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int sum = 0;
		
		for (int i=0;i<count-2;i++)
		{
		String text=table1.findElements(By.cssSelector("[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int textvalue=Integer.parseInt(text);
		sum = sum + textvalue;
		
		}
		System.out.println(sum);
		
		String extra=table1.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extravalue=Integer.parseInt(extra);
		int TOTAL1= sum + extravalue;
		System.out.println("total runs are:");
		System.out.println(TOTAL1);
		String FinalScore= table1.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int FinalScoreValue = Integer.parseInt(FinalScore);
		if(TOTAL1==FinalScoreValue)
		{
			System.out.println("scores are matching");
		}
		else
		{
			System.out.println("scores are not matching");
		}
	}

}
