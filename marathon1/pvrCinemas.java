package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pvrCinemas {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[@class = 'thumnail clearfix'])[4]")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//div[@class = 'nav-icon']/i")).click();
		
		driver.findElement(By.xpath("//a[text() = 'Movie Library']")).click();
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//select[@name = 'genre']")).click();
		
		Select genres = new Select(driver.findElement(By.xpath("//select[@name = 'genre']")));
		
		genres.selectByVisibleText("ANIMATION");
		
		driver.findElement(By.xpath("//select[@name = 'lang']")).click();
		
        Select lang = new Select(driver.findElement(By.xpath("//select[@name = 'lang']")));
		
        lang.selectByVisibleText("ENGLISH");
        
        driver.findElement(By.xpath("//button[text() ='Apply']")).click();
        
        //Thread.sleep(2000);
        
        WebElement findElement = driver.findElement(By.xpath("//div[@class = 'movie-list']//img"));
        
        driver.executeScript("arguments[0].click();", findElement);
        
        driver.findElement(By.xpath("//button[text() = 'Proceed To Book']")).click();
        
        driver.findElement(By.id("cinemaName")).click();
        
        Select cinema = new Select(driver.findElement(By.id("cinemaName")));
        
        cinema.selectByIndex(2);
        
        driver.findElement(By.xpath("//div[contains(@class, 'datepicker-container')]/input")).click();
        
        driver.findElement(By.xpath("(//div[@class = 'main-calendar-days'])/span[32]")).click();
        
        driver.findElement(By.xpath("//select[@name = 'timings']")).click();
        
        Select timings = new Select(driver.findElement(By.xpath("//select[@name = 'timings']")));
        
        timings.selectByIndex(2);
        
        driver.findElement(By.xpath("//input[@name = 'noOfTickets']")).sendKeys("2");
        
        driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("Abirami");
        
        driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("abirami@gmail.com");
        
        driver.findElement(By.xpath("//input[@name = 'mobile']")).sendKeys("9884448844");
        
        driver.findElement(By.xpath("//select[@name = 'food']")).click();
       
        Select food = new Select(driver.findElement(By.xpath("//select[@name = 'food']")));
        
        food.selectByValue("No");
        
        driver.findElement(By.xpath("//input[@name = 'comment']")).sendKeys("NIL");
        
        driver.findElement(By.xpath("//input[@id = 'copySelf']/parent::label")).click();
        
        driver.findElement(By.xpath("//button[text()= 'SEND REQUEST']")).click();
        
        Thread.sleep(100);
        
        driver.findElement(By.xpath("(//button[text() = 'CANCEL'])[2]")).click();        
        
        driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
        
        
        
       
        
     
		

	}

}
