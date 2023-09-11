package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MailPage {
	
	public void send(WebDriver driver) throws InterruptedException {
		System.out.println("Starting Mail Page");
		//press on the mail icon
		driver.findElement(By.id("ybarMailLink")).click();
		
		
		//Choosing Radio Buttons inside the Setting area
		
		//Press on Setting
	    driver.findElement(By.ByXPath.cssSelector(".P_0 > .i_0")).click();
		Thread.sleep(2000);
		
		//Choose Different Radio Buttons
	    driver.findElement(By.ByXPath.cssSelector(".W_73HH")).click();
		Thread.sleep(2000);
	    driver.findElement(By.ByXPath.cssSelector("li:nth-child(3) > div > .e_dRA")).click();
		Thread.sleep(2000);
	    driver.findElement(By.ByXPath.cssSelector(".e_dRA > .W_6D6F")).click();
		Thread.sleep(2000);
	    driver.findElement(By.ByXPath.cssSelector("li:nth-child(2) > div > .e_dRA")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		//Choosing mails from inside the mail box.
		driver.findElement(By.xpath("//a/div/div/div/button/span")).click();
	    driver.findElement(By.xpath("//li[3]/a/div/div/div/button/span")).click();
	    {
	      WebElement element = driver.findElement(By.xpath("//li[4]/a/div/div/div/button/span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.cssSelector(".H_A:nth-child(4) .en_0 .D_F")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }

		//Choosing value from ComboBox inside the mail box
	    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-date_desc']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();

	    driver.findElement(By.ByXPath.cssSelector("li[data-test-id='sort-by-date_asc']")).click();
	
	    driver.findElement(By.ByTagName.cssSelector("button[data-test-id='toolbar-sort-menu-button']")).click();
	    Thread.sleep(3000);

		//Go out of setting
		driver.findElement(By.ByXPath.cssSelector("div[data-test-id='virtual-list-container']")).click();

}
}
	



