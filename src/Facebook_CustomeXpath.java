import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_CustomeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-a5-manual01.adstreamdev.com");
		//driver.findElement(By.id("username")).sendKeys("mak@gmail.com");
		/*driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("waesfdfdsf");
		driver.findElement(By.xpath("//input[@value=\'Log In\']")).click();*/
		//System.out.println(driver.findElement(By.cssSelector("div#notification.notification.error")).getText());
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("abcdefghA1");
		driver.findElement(By.cssSelector("input[name='login']")).click();

	}

}
