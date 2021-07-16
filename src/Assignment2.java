import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		Select adult=new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("5");
		Select child=new Select(driver.findElement(By.id("Childrens")));
		child.selectByValue("4");
		driver.findElement(By.xpath("(//input[@data-warningvalidator='true'][1])")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Go air");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}


	


