package Sample_Test_UnionBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incubyte {
	
	
	
@Test
	
	public void Incubyte() {
			System.setProperty("webdriver.gecko.driver", "./driver/chromedriver.exe");
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
		
			WebDriver driver= new ChromeDriver(options);	System.out.println("Chrome browser is lanching ");
			// clear the cookies and use implesity wait
			driver.manage().deleteAllCookies();
			//i had taken the all input from config.properties
			//in that file allthe information are present 
			driver.manage().timeouts().pageLoadTimeout(50000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			driver.get("https://www.gmail.com/");
			// get the url link
			driver.findElement(By.xpath("Gmail_ID_Customize xpath")).sendKeys("Gmail_Id");
			driver.findElement(By.xpath("Next Button_Customize xpath ")).click();
			driver.findElement(By.xpath("Customize xpath")).sendKeys("psw");
			driver.findElement(By.xpath("Sign In Button_Customize xpath")).click();
		
			driver.findElement(By.xpath("Compose_Customize xpath")).click();
			driver.findElement(By.xpath("Body text_Customize xpath")).sendKeys("Body_Text");
			driver.findElement(By.xpath("Subject text_Customize xpath")).sendKeys("Subject_Text");
			//inspect the xpath of username xpath
		
			driver.manage().timeouts().pageLoadTimeout(50000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			System.out.println("##########################################");
			driver.manage().window().maximize();
			//then end the program 
			driver.close();
	}

}
