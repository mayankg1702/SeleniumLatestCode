import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com"); //hit url mentioned in it
		System.out.println(driver.getTitle()); // validate the correct title of page
		System.out.println(driver.getCurrentUrl()); // validate user landed on correct url
		//System.out.println(driver.getPageSource());
		driver.get("http://yahoo.com");
			//driver.navigate().back();	
		driver.close();
	}

}
