package PagesVer;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageVer1 {

	
WebDriver driver;


@FindBy(xpath = "//span[contains(text(),'Search')]")
WebElement SERChe;

@FindBy(id="globalSearch")
WebElement sen;

@FindBy(xpath="//main//li[2]//div[1]//div[1]//img[1]")
WebElement Iphone11;

@FindBy(xpath = "//label[4]//span[1]//div[1]//div[1]")
WebElement gig;

@FindBy(xpath = "//*[contains(text(),'Color:Space Gray')]")
WebElement color;

@FindBy(id="signoutText")
WebElement signin;

@FindBy(xpath ="//span[contains(text(),'My Account')]")
WebElement MyAcc;

@FindBy(id="loginHeaderUsername")
WebElement lonin;

@FindBy(id="loginHeaderPassword")
WebElement Passwor;

@FindBy(id="loginHeaderButton")
WebElement submt;



public PageVer1(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);

}


public void SERChe()  {

SERChe.click();}

public void SERChe1() throws InterruptedException  {
sen.click();
sen.sendKeys("Apple");

sen.sendKeys(Keys.ENTER);
Thread.sleep(4000);
Iphone11.click();
Thread.sleep(2000);
gig.click();
Thread.sleep(4000);
color.click();
}




public void sinin() {
	signin.click();
}
	public void myacc() {
	MyAcc.click();
	}
	public void login(String Loginid) {
	lonin.sendKeys(Loginid);
	}
	public void Paswor(String Passworid) {
	Passwor.sendKeys(Passworid);
	}
	public void submit() {
	submt.click();
	}
	
	public void empty() {
		lonin.clear();
	}
    
}
