import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
       System.out.println(table.findElements(By.tagName("tr")).size());
       System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
       List<WebElement> thirdrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
       System.out.println(thirdrow.get(0).getText());
       System.out.println(thirdrow.get(1).getText());
       System.out.println(thirdrow.get(2).getText());

	}

}
