package RunVer;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import CommonVer.BrowserVer;

public class CartVerTest extends BrowserVer {
  @Test
  public void f() throws InterruptedException {
	  

		WebElement Cart=driver.findElement(By.xpath("//*[@title=\"Cart\"]"));
		
	  Actions CART=new Actions(driver);
			  CART.keyDown(Keys.SHIFT).click(Cart).keyUp(Keys.SHIFT).build()
.perform();			  
			  
	/*	String Deals= driver.getWindowHandle();	
		System.out.println(Deals);
		driver.switchTo().window(Deals);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='phoneEmail']")).sendKeys("KUKU");
		Thread.sleep(3000);
		*/

		 String parentwindow=driver.getWindowHandle();
		   Set<String> windows=driver.getWindowHandles();
		   for(String contr:windows) {
		     System.out.println(contr);
		    if(contr!=parentwindow) {
		      // if(!contr.equals(parentwindow)) {
		   driver.switchTo().window(contr);
		   
		   Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='phoneEmail']")).sendKeys("KUKU");
  }
		   }}}
