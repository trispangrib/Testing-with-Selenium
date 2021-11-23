package seleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();

		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		driver.get("https://www.makeoverforall.com/auth");
		
		//Wait for 2 sec
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("pangaribuantriska@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pangaribuan99");
		driver.findElement(By.cssSelector("button.btn.btn-secondary.w-100[type='submit']")).click();
		//Wait for 2 sec
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/nav/div/div[2]/div/div[2]/div/div"));
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]")).click();
		//Wait for 10 sec
		Thread.sleep(10000);
		//closing the browser
		driver.close();
	}
}
