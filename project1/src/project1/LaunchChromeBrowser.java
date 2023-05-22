package project1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChromeBrowser{
   public static void main(String[] args) throws InterruptedException  {
     
      // browser type and chromedrover.exe path as parameters
      System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\M1053553\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = " https://www.google.com";
      driver.get(url);
      Thread.sleep(2000);
      driver.quit();
      
   }
}
