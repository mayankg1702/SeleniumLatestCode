import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.acceptInsecureCerts();
		
		ChromeOptions co=new ChromeOptions();
		
		co.merge(dc);
		
		WebDriver driver1=new ChromeDriver(co);
	}

}
