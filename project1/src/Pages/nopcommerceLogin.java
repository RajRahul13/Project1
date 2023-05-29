package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nopcommerceLogin {
	private static WebElement element;
	
	public static WebElement Email(WebDriver driver) {
		element=driver.findElement(By.cssSelector("#Email"));
		return element;
	}
	public static WebElement Password(WebDriver driver) {
		element=driver.findElement(By.cssSelector(".password"));
		return element;
	}
	public static WebElement LoginBtn(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		return element;
	}
	public static WebElement LogoutBtn(WebDriver driver) {
		element=driver.findElement(By.cssSelector(".ico-logout"));
		return element;
	}

}
