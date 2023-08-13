package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MainYahooMail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.out.println("Starting Driver");
		//System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();		
		driver.get("https://www.yahoo.com");
		Thread.sleep(1000);

		
		//Link to the Mail section from the Yahoo.com 
		driver.findElement(By.id("root_1")).click();

		//Pressing on Sign-In from the Pink page (only if you logged out)
		driver.findElement(By.linkText("Sign in")).click();
	    
		Thread.sleep(2000);

	    //Pressing on the Next button	
	    driver.findElement(By.id("login-username")).sendKeys("qaclass2022");
	    
	    //Pressing on the Next button
	    driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.id("login-passwd")).sendKeys("QA2409!");
		Thread.sleep(2000);
	    driver.findElement(By.id("login-signin")).click();

	    driver.findElement(By.id("password-toggle-button")).click();
		Thread.sleep(2000);

	}

}
