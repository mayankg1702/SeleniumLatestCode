import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
		
		System.out.println(driver.getTitle());
		
		
		Set<String>id=driver.getWindowHandles(); //used method to handle windows
		java.util.Iterator<String> it=id.iterator(); //another method "iterator" to get the desired id from set structure
		String Parentid=it.next(); // iterate from top 
		String Childid=it.next();   
		driver.switchTo().window(Childid);
        System.out.println(driver.getTitle());
		driver.switchTo().window(Parentid);
        System.out.println(driver.getTitle());

	}

}
