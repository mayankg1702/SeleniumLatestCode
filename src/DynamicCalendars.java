import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCalendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.cssSelector("#travel_date")).click();
		Thread.sleep(2000);
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> Days= driver.findElements(By.className("day"));
		int size= driver.findElements(By.className("day")).size();

		for(int i=0; i<size;i++)
		{

			String Condition= driver.findElements(By.className("day")).get(i).getText();

			if (Condition.equals("14"))
			{

				driver.findElements(By.className("day")).get(i).click();
				break;
				

			}
		}

	}

}
