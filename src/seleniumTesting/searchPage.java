package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class searchPage {
	public static void main(String[] args) throws InterruptedException {
		
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();
		
		//open web app
		driver.get("https://www.makeoverforall.com/");
		
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]")).click();

		//typing a text
		driver.findElement(By.xpath("//*[@id=\"nav-item-10\"]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("search")).sendKeys("Mascara",Keys.ENTER);

	
		//Wait for 20 sec
		Thread.sleep(20000);
		//closing the browser
		driver.close();
	}
}
