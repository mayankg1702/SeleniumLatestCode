import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mak@gmail.com");
		//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("pass12345");
        /*driver.findElement(By.id("email")).sendKeys("mak@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("mayank2123");
        driver.findElement(By.linkText("Forgotten account?")).click();*/
		
Regulare_xpressions:
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

driver.findElement(By.cssSelector("input[id=\'login1\']")).sendKeys("admin@gmail.com");
driver.findElement(By.xpath("//input[contains(@id,'passwor')]")).sendKeys("abc@123");
driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
