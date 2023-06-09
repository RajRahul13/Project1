/**
 * 
 */
package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

/**
 * @author M1053553
 *
 */
public class CrossBrowser {

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
	}
	public static void setBrowser() {
		browser = "Chrome"; 
	//	browser = "EdgeDriver";

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
		WebElement Email = driver.findElement(By.xpath("//input[@class ='email']"));
		Email.sendKeys("Test@gmail.com");
		WebElement Password = driver.findElement(By.className("password"));
		Password.sendKeys("Test@123");
		WebElement Submit = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		Submit.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Logout() {
	//	WebElement LogoutBtn = driver.findElement(By.xpath("//a[@class=\"ico-logout\"]"));
		WebElement LogoutBtn = driver.findElement(By.cssSelector(".ico-logout"));
		LogoutBtn.click();
	}

}
