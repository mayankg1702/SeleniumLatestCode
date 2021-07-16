import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regulare_xpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.cssSelector("input[id=\'login1\']")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'passwor')]")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
