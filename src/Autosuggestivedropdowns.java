import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		WebElement Destination=driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		Destination.sendKeys("lon");
		//sleep.thread(2000);
		Destination.sendKeys(Keys.ARROW_DOWN);
		Destination.sendKeys(Keys.ENTER);
	}

}
