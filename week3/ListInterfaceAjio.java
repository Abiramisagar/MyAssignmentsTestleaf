package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterfaceAjio {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.findElement(By.xpath("//input[@name ='searchVal']")).sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();			
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(@class,'Men - Fashion Bags')]")).click();
		
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Number of items found : "+text);
		
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		
		System.out.println("The Brand names are ");
		for (WebElement each : brandName) {
			
			String brand = each.getText();			
			System.out.println(brand);
			
		}
		
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println("The bag names are ");
		for (WebElement each : bagName) {
			
			String bag = each.getText();
			System.out.println(bag);
			
		}
		
		
	}
	
	
	
	

}
