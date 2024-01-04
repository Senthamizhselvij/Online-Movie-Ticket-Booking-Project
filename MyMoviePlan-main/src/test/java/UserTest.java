import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class UserTest {
	WebDriver webdriver = null;
	 String URL = "http://localhost:4200/loginc";

	 @Test
	 public void f() throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32/chromedriver.exe");
	  WebDriver webdriver = new ChromeDriver();
	  webdriver.get(URL);
	  webdriver.manage().window().maximize();
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("sri123@gmail.com");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("sri@123");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[3]/div/button")).click();
	  Thread.sleep(2000);
	  
	  
	 }
}
