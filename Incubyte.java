package Sample_Test_UnionBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.openqa.selenium.remote.session.InternetExplorerFilter;
import org.testng.annotations.Test;

public class Incubyte {
	static Properties prop= new Properties();
	
	
@Test
	
	public void Incubyte() throws IOException {
	
	
	
	FileInputStream ip= new FileInputStream("C:\\Users\\kmthi\\git\\Demo_Incubyte\\SeleniumSessions\\src\\Sample_Test_UnionBank\\config.properties");
	
	prop.load(ip);
	
	
	System.out.println(prop.getProperty("Gmail_Id"));
	System.out.println(prop.getProperty("psw"));
	System.err.println(prop.getProperty("Body_Text"));
	System.out.println(prop.getProperty("Subject_Text"));
	
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
			driver.findElement(By.xpath("// input [@type='email']")).sendKeys("Gmail_Id");//enter the gmail_id
			driver.findElement(By.xpath("// button [ @class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-"
					+ "LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qfvgSe qIypjc TrZEUc lw1w4b' ]")).click();//click the next
			driver.findElement(By.xpath("// input [@type='password']")).sendKeys("psw");//enter the psw
			driver.findElement(By.xpath("// div [@id='passwordNext']")).click();//click the next
		
			driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();//click the compose
			driver.findElement(By.xpath("//div [@id=':9f']")).sendKeys("Body_Text");
			driver.findElement(By.xpath("//input [@name='subjectbox']")).sendKeys("Subject_Text");
			//inspect the xpath of username xpath
		
			driver.manage().timeouts().pageLoadTimeout(50000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
			System.out.println("##########################################");
			driver.manage().window().maximize();
			//then end the program 
			driver.close();
	}

}
