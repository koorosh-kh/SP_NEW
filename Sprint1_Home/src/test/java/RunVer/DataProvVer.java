package RunVer;

import org.testng.annotations.Test;

import CommonVer.BrowserVer;
import PagesVer.PageVer1;

import org.testng.annotations.DataProvider;

public class DataProvVer extends BrowserVer {
  @Test(dataProvider = "dp1")
  public void f(String n, String s) throws InterruptedException {
	  
	  PageVer1 j=new PageVer1(driver);
	  
	  j.sinin();
	  j.myacc();
	  j.login(n);
	  j.Paswor(s);
	  j.submit();
	  driver.navigate().back();
	 Thread.sleep(2000);
	 driver.navigate().back();
	 Thread.sleep(2000);
  }
  
  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "kuku", "Kian" },
      
      new Object[] { "Hello", "Hi" },
      new Object[] { "1111", "2222" },
      new Object[] { "Selenium", "Java" },
      
    };
  }
}
