import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookSeats {
	WebDriver webdriver = null;
	 String URL = "http://localhost:4200/bookseats";
  @Test
  public void f() throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32/chromedriver.exe");
	  WebDriver webdriver = new ChromeDriver();
	  webdriver.get(URL);
	  webdriver.manage().window().maximize();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-seat-booking/div[2]/div[7]/div[7]")).click();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-seat-booking/div[2]/div[11]/button")).click();
	  Thread.sleep(2000);
	  
	  //checkOut
	  webdriver.findElement(By.xpath("/html/body/app-root/app-checkout/div[2]/div/div[3]/a")).click();
	  Thread.sleep(2000);
	  
	  //card Details
	  webdriver.findElement(By.xpath("/html/body/app-root/app-payment/div/div/form/p[1]/input")).sendKeys("abcd");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-payment/div/div/form/p[2]/input")).sendKeys("123456789");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-payment/div/div/form/p[3]/input")).sendKeys("6789");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-payment/div/div/form/div/a")).click();
	  Thread.sleep(2000);
  }
}
