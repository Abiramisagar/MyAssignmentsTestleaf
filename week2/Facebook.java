package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Abirami");
		
		driver.findElement(By.name("lastname")).sendKeys("sagar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9998877766");
		
		driver.findElement(By.id("password_step_input")).sendKeys("123as");
		
		Select day = new Select(driver.findElement(By.id("day")));
		
		day.selectByValue("24");
		
		Select month = new Select(driver.findElement(By.id("month")));
		
		month.selectByValue("4");
		
		Select year = new Select(driver.findElement(By.id("year")));
		
		year.selectByValue("1990");
		
		driver.findElement(By.xpath("//input[@value = '2']")).click();	

}
}
