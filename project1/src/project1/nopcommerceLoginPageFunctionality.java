/**
 * 
 */
package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import Pages.nopcommerceLogin;
import Pages.nopcommerceLoginPage;
/**
 * @author M1053553
 *
 */
public class nopcommerceLoginPageFunctionality {

	/**
	 * @param args
	 */
	static String browser;
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBrowser();
		setBrowserConfig();
		Login();
		Logout(); 
		driver.close();
	}
	public static void setBrowser() {
	//	browser = "Chrome"; 
		browser = "EdgeDriver";

	}
	public static void setBrowserConfig() {
		if (browser=="Chrome") {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		}
		
		if (browser=="EdgeDriver") {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
		}
	}
	public static void Login() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		
		nopcommerceLoginPage LoginPage = new nopcommerceLoginPage(driver);
		LoginPage.setTextEmail("Test@gmail.com");
		LoginPage.setTextPassword("Test@123");
		LoginPage.clickLoginBtn();
		
	}
	public static void Logout() {
		nopcommerceLoginPage Logout = new nopcommerceLoginPage(driver);
		Logout.clickLogoutBtn();
	}

}
