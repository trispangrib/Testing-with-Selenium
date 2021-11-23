package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;

public class addtocartPage {

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
		
		//select the menu "New"
		driver.findElement(By.xpath("//*[@id=\"nav-item 1\"]/a")).click();
		
		//select product
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement visible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qcw-login-form-iframe")));
		visible.click();
	
		driver.switchTo().defaultContent();
		//add to bag
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section[1]/div/div/div[2]/section/div[5]/div[1]/button")).click();
		//Wait for 20 sec
		Thread.sleep(20000);
		//closing the browser
		driver.close();
	}

}
