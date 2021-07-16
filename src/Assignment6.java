import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// TODO Auto-generated method stub
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String Checkbox= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText(Checkbox);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(Checkbox);
		
		driver.findElement(By.cssSelector("#alertbtn")).click();
		
		String alert = driver.switchTo().alert().getText();
		
		if (alert.contains(Checkbox))
		{
			
			System.out.println("Yes i am at right place");
		}
		else
		{
			
			System.out.println("At wrong place");
		}
		
		driver.switchTo().alert().accept();
	}

	}


