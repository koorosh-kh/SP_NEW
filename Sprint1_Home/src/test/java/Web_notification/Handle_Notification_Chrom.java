package Web_notification;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Handle_Notification_Chrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon_Home\\DriverVer\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://www.sprint.com");
	}

}
