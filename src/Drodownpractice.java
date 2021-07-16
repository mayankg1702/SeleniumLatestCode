import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drodownpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//input[@name='passenger']")).click();
		//Thread.sleep(2000L);
		/*int i=1;
while(i<5)*/

		//System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getText());

		for(int i=1;i<5;i++)

		{
			driver.findElement(By.className("icon-plus")).click();
			//i++;
			//System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getText());
driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
			
			
		}

	}
	}


