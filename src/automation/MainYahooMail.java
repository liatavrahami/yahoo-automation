package automation;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MainYahooMail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.out.println("Starting Driver");
		System.setProperty("webdriver.gecko.driver", "c:\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "c:\\Selenium\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();		
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);

		//Compare between the actual and expected title using Assertion by JUNIT 5
		String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
		
		
		NewsPage news = new NewsPage();
		news.read(driver);
		
		SportsPage sports = new SportsPage();
		sports.move(driver);
		
		MailPage mail = new MailPage();
		mail.send(driver);
		
		//Closing the driver
		System.out.println("Closing the Driver");
		driver.close();

	}

}