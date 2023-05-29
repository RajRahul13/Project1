package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class nopcommerceLoginPage {
	WebDriver driver = null;
	//Locating Objects of page
	By Email = By.cssSelector("#Email");
	By Password = By.cssSelector(".password");
	By LoginBtn = By.xpath("//button[@class='button-1 login-button']");
	By LogoutBtn = By.cssSelector(".ico-logout");
	
	//constructor
	public nopcommerceLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	//adding actions on the Page Object
	public void setTextEmail(String text) {
		driver.findElement(Email).sendKeys(text);
	}
	public void setTextPassword(String text) {
		driver.findElement(Password).sendKeys(text);
	}
	public void clickLoginBtn() {
		driver.findElement(LoginBtn).sendKeys(Keys.RETURN);
	}
	public void clickLogoutBtn() {
		driver.findElement(LogoutBtn).sendKeys(Keys.RETURN);
	}

}
