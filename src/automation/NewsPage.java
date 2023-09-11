package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewsPage {
	
	public void read(WebDriver driver) throws InterruptedException {
		System.out.println("Starting News Page");
	
	    driver.manage().window().setSize(new Dimension(1550, 838));
	    //press on sign in button
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("login-username")).sendKeys("yoyotest10");
	    Thread.sleep(3000);
	    //press on next button
	    driver.findElement(By.id("login-signin")).click();
	    //stop to solve the captcha (debug)    
	    driver.findElement(By.id("login-passwd")).sendKeys("yoyogam10");
	    //press on next button
	    driver.findElement(By.id("login-signin")).click();
	    {
	      WebElement element = driver.findElement(By.id("root_2"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    //press on the news link
	    driver.findElement(By.id("root_2")).click();
	    driver.findElement(By.id("root_2")).click();
	  
	 int count = 0;
	 int expectedLinks = 81;
	 List<WebElement> link = driver.findElements(By.tagName("a"));
	 System.out.println(link.size()); // this will print the number of links in a page.
	 count =  link.size();
	 
	 if(count==expectedLinks){
		 System.out.println("Number of links in the News page are correct " + count );
	 }else
	 {
		 System.out.println("Number of links  in the News page are incorrect " + count + " vs "+expectedLinks);
	 }
	
	}
}




