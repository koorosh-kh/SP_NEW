package RunVer;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonVer.BrowserVer;
import PagesVer.DealVer;
import PagesVer.PageVer1;

public class Switch extends BrowserVer{
  @Test
  public void f () throws InterruptedException {
	  

		WebElement Cart=driver.findElement(By.xpath("//*[@title=\"Cart\"]"));
		
	  Actions CART=new Actions(driver);
			  CART.keyDown(Keys.SHIFT).click(Cart).keyUp(Keys.SHIFT).build()
.perform();	
	  
			    
			  
	//how to open new window using shift keyboard
	  
	   String parentwindow=driver.getWindowHandle();
	   Set<String> windows=driver.getWindowHandles();
	   for(String contr:windows) {
	     System.out.println(contr);
	    if(contr!=parentwindow) {
	      // if(!contr.equals(parentwindow)) {
	   driver.switchTo().window(contr);
	   
	   
	    
	   }}
	   DealVer tt=new DealVer(driver);
	   
	   Thread.sleep(2000);
	   tt.Del1();
	   Thread.sleep(4000);
	   tt.Ipone11();
	   Thread.sleep(7000);
	   tt.chkout();
	   Thread.sleep(7000);
	   tt.firstnam();
	   tt.lastnam();
	   Thread.sleep(5000);
  
for(String contr:windows) {
    System.out.println(contr);
   if(contr!=parentwindow) {
     // if(!contr.equals(parentwindow)) {
  driver.switchTo().window(parentwindow);}}

PageVer1 yy=new PageVer1(driver);

yy.SERChe();

  }}

