package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class leafGrdButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//h5[text() = 'Click and Confirm title.']/following-sibling::button")).click();
		
		String page = driver.getTitle();
		
		if(page == "Dashboard")
		{
			System.out.println("Page Tittle is "+page);
		}
		
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//h5[text() = 'Confirm if the button is disabled.']/following-sibling::button")).isEnabled();
		
		System.out.println(enabled);
		
		Point location = driver.findElement(By.xpath("//span[text() ='Submit'][1]")).getLocation();
		
		System.out.println(location);
		
		String cssValue = driver.findElement(By.xpath("//span[text() ='Save']")).getCssValue("background-color");
		
		System.out.println(cssValue);
		
		Dimension dimension = driver.findElement(By.xpath("//h5[contains(text(), 'height and width')]/following-sibling::button")).getSize();
		
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());
		
		driver.close();
		

	}

}
