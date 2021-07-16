import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(0); // By Index - 0th Index means 1 index
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); // by Weblement
	    driver.findElement(By.id("draggable")).click();
	    
	    Actions ac=new Actions(driver);
	  WebElement source =driver.findElement(By.id("draggable"));
	  WebElement target =driver.findElement(By.id("droppable"));

	  ac.dragAndDrop(source, target).build().perform();
	  driver.switchTo().defaultContent(); //to get back from the frames

	}

}
