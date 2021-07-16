import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Broken_links {
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Version_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		 driver.manage().window().maximize();
		
		 
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	 //open site
        driver.get("https://www.google.com/");
        
       // driver.findElement(By.xpath("(//*[@id='popup-buttons']/button[2])")).click();
        
        //driver.findElement(By.xpath("//div[@data-country= 'Europe']")).click();
        
        //driver.findElement(By.linkText("English")).click();
          
        //1. get the list of all the links and images
        
           List <WebElement> linkslist = driver.findElements(By.tagName("a"));
		
           linkslist.addAll(driver.findElements(By.tagName("img")));
           
           
           
           //get the size of all complete links list
           System.out.println("all links are " + linkslist.size());
           
           List <WebElement> activelinks = new ArrayList<WebElement>();
           
           // 2. iterate linklist : exclude all the links/images does not have any href attribute
           
           for (int i=0;i<linkslist.size();i++)
           {
        	 
        	   if (linkslist.get(i).getAttribute("href") != null && (! linkslist.get(i).getAttribute("href").contains("null"))) {
        		   
        		 activelinks.add(linkslist.get(i));
        		   
        	   }
        	  
        	   
           }
           //get the size of active links list
           System.out.println("active links are " + activelinks.size());
           
         //3. check the href url, with httpconnection api.
           for (int j=0; j<activelinks.size();j++)
        		   {
        	   
        	   HttpURLConnection Connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
        	   
        	   Connection.connect();
        	   
        	  int response =  Connection.getResponseCode();
        	   
        	   //Connection.disconnect();
        	   
        	   System.out.println(activelinks.get(j).getAttribute("href") +"----->"+ response);
        	   
        	   
        		   }
           
           
           
	}


}
