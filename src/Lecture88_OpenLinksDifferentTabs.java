import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lecture88_OpenLinksDifferentTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// 2. to find link count in the footer section of the page
		WebElement Footerdriver=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		
		//3. to find links count from the 1st column of the footer
		
		WebElement firstcolumn=Footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		
		System.out.println(firstcolumn.findElements(By.tagName("a")).size());
		
		//4. To click on each link in the column
		
		for (int i=1; i<firstcolumn.findElements(By.tagName("a")).size(); i++)
		{
			String Click=Keys.chord(Keys.CONTROL,Keys.ENTER);  //query for control + Enter button to open links in different tab
			firstcolumn.findElements(By.tagName("a")).get(i).sendKeys(Click);
			Thread.sleep(15000);
			
		}
		
		Thread.sleep(5000);

			
			Set<String> windowmove=driver.getWindowHandles();
			Iterator<String >it=windowmove.iterator();
			while(it.hasNext()) 
			{
				
			driver.switchTo().window(it.next());
			
			System.out.println(driver.getTitle());
			
				
			}
	}

}
