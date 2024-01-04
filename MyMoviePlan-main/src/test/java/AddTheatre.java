import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class AddTheatre {
	WebDriver webdriver = null;
	 String URL = "http://localhost:4200/loginc";

	 @Test
	 public void f() throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver_win32/chromedriver.exe");
	  WebDriver webdriver = new ChromeDriver();
	  webdriver.get(URL);
	  webdriver.manage().window().maximize();
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[1]/input")).sendKeys("admin123@gmail.com");
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[2]/input")).sendKeys("admin@123");
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/div/div/form/div[3]/div/button")).click();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/nav/div/ul/li[1]/button")).click();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-dashboard/nav/div/ul/li[1]/ul/li[2]/button")).click();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-theaters/div[1]/div/h1/span/button")).click();
	  Thread.sleep(2000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-theater/div/div/form/div[1]/div[1]/input")).sendKeys("Kasi");
	  Thread.sleep(1000);
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-theater/div/div/form/div[1]/div[2]/input")).sendKeys("Kumbakonam");
	  Thread.sleep(1000);
	  Select Movie=new Select( webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-theater/div/div/form/div[2]/select")));
	  Movie.selectByIndex(1);
	  Thread.sleep(1000);
	  
	  webdriver.findElement(By.xpath("/html/body/app-root/app-admin-add-theater/div/div/form/div[3]")).click();
	  Thread.sleep(2000);
	  
	  System.out.println("search tested successfully");
	 }
	 
}
