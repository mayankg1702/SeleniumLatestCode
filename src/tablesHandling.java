import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		WebElement ParentTable=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
			int row1 = ParentTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

			for (int i=0;i<row1-2;i++)
			{
				
				String Value= ParentTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
				int addition=Integer.parseInt(Value);
				sum =sum+addition;
				
			}
			
			//System.out.println(sum);

			String Extras = (driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
			int ExtrasValue = Integer.parseInt(Extras);
			int totalrun = sum+ExtrasValue;
			System.out.println(totalrun);
			
			String Actualtotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
			int finalvalue = Integer.parseInt(Actualtotal);

			if (finalvalue==totalrun)
			{
				
				System.out.println("Count Matches");
				
			}

			else
			{
				System.out.println("Count not matches");
			}
	}

}
