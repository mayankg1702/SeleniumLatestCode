import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableColumnSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List <WebElement> fruitslist = driver.findElements(By.cssSelector("tr td:nth-child(2)")); //Grabbing the web elements
		
		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		for (int i=0;i<fruitslist.size();i++)
		{
			
			arraylist1.add(fruitslist.get(i).getText()); //add web elements of list added to Array list by add method
			
			}
		
		ArrayList<String> arraylist2 = new ArrayList<String>();
		
		for (int i=0;i<arraylist1.size();i++)
		{
			
			arraylist2.add(arraylist1.get(i)); // copied all the list items from arraylist1 to arraylist2
		}
	Collections.sort(arraylist2); // for ascending order
	
	Collections.reverse(arraylist2);  //for descending order
	
	Assert.assertTrue(arraylist1.equals(arraylist2));

	}

}
