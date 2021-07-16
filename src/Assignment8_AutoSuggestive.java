import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys("po");
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

		//*********************USE OF JAVASCRIPT EXECUTOR********************************************

		/*JavascriptExecutor js= (JavascriptExecutor)driver;
		String command = "return document.getElementById(\"autocomplete\").value;";
         String text = (String) js.executeScript(command);
         System.out.println(text);
 		{

 			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);	
 			text = (String) js.executeScript(command);
 			System.out.println(text);*/


	}

}
