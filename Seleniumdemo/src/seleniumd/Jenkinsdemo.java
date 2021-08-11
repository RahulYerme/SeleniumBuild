package seleniumd;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Jenkinsdemo {
	@Test
     
	public void jenkins() {
		
		System.setProperty("webdriver.chrome.driver","E:\\NewCromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("HI, This is jenkins demo test case");
		//driver.navigate().to("https://www.amazon.in");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoes");
		
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")).click();
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //driver.navigate().back();
	    //String title = driver.getTitle();
	    //System.out.println("page title is :-" + title);
	    driver.navigate().to("https://www.facebook.com/");
		  driver.findElement(By.name("email")).sendKeys("rahulyerme67@gmail.com");
		  
		  driver.findElement(By.name("pass")).sendKeys("Rahul@2897");
		  driver.findElement(By.name("login")).click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.navigate().back();
		  driver.close();
	}
	
	 
     

}