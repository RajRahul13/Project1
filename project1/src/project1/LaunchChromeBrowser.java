package project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LaunchChromeBrowser{
   public static void main(String[] args) throws InterruptedException  {
     
      // browser type and chromedrover.exe path as parameters
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        String url = " https://www.google.com";
        driver.get(url);
        Thread.sleep(2000);
        driver.quit();
      
   }
}
