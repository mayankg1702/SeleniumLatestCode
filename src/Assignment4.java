import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();

		Set<String> id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();           		
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);  // in child section 
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);   // in parent section
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());


	}



	}


