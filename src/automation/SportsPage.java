package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SportsPage {

	public void move(WebDriver driver) throws InterruptedException {
		System.out.println("Starting sports Page");
        //press on the sports link
	    driver.findElement(By.linkText("SPORTS")).click();
	    //press on the fantasy link 
	    driver.findElement(By.linkText("Fantasy")).click();
	  }

		}
	    
	    
	  
	

	



	
		


		



