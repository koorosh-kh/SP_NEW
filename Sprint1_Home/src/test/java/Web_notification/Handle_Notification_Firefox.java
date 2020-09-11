package Web_notification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Handle_Notification_Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon_Home\\DriverVer\\geckodriver.exe");
        
		FirefoxOptions option=new FirefoxOptions();
		
		option.addPreference("dom.webnotifications.enable", false);
		
		WebDriver driver=new FirefoxDriver(option);
		
		driver.get("http://www.sprint.com");

	}

}
