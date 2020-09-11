package PagesVer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class DealVer {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[contains(@class,'cartfullpage')]//div[6]//div[1]//a[1]//img[1]")
	WebElement Del;
	
    @FindBy(xpath = "//a[@id='accessory-item-715802844263']")
    WebElement Iphone11;

   @FindBy(xpath = "//button[contains(@class,'button button--full font-medium')]")
   WebElement Checkout;
	
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastname;

	
	public DealVer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

	public void Del1() {
		Del.click();
		
	}
	public void Ipone11() {
		Iphone11.click();
		
	}
	
	public void chkout() {
		Checkout.click();
		
	}
	public void firstnam() {
		firstname.sendKeys("kuku");
		
	}
	public void lastnam() {
		lastname.sendKeys("khei");
		
	}
	
	
}

