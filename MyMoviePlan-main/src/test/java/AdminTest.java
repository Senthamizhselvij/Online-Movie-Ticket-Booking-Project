import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminTest {
 WebDriver webdriver = null;
 String URL = "http://localhost:4200/loginc";

 @Test
 public void f() throws InterruptedException {

  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32/chromedriver.exe");
  WebDriver webdriver = new ChromeDriver();
  webdriver.get(URL);
  webdriver.manage().window().maximize();
  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("admin123@gmail.com");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("admin@123");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[3]/div/button")).click();
  Thread.sleep(2000);
  
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/nav/div/ul/li[1]/button")).click();
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/nav/div/ul/li[1]/ul/li[1]/button")).click();
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-movies/div[1]/div[1]/h1/span/button")).click();
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[1]/div[1]/input")).sendKeys("prince");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[1]/div[2]/input")).sendKeys("2:00");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[2]/div[1]/input")).sendKeys("Tamil");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[2]/div[2]/input")).sendKeys("Comedy");
  Thread.sleep(1000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[2]/div[3]/input")).sendKeys("https://images.news18.com/ibnlive/uploads/2022/06/untitled-design-18-2.png");
  Thread.sleep(2000);
  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-movie/div/div/form/div[3]")).click();
  Thread.sleep(2000);
  
 }
}
