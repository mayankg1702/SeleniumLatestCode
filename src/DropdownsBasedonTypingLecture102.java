import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownsBasedonTypingLecture102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");

		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);	


		JavascriptExecutor js= (JavascriptExecutor)driver; //Javascript Executor
		String command = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(command);
		System.out.println(text);
		int i=0;
		while (!text.equalsIgnoreCase("BENGALURU INTERNA3232TION AIRPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);	
			text = (String) js.executeScript(command);
			System.out.println(text);

			if (i>10)
			{

				break;			
				}
			System.out.println("element not found");

		}

	}

}
