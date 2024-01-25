package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.utils.FileUtil;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        // Launch the browser
        ChromeDriver driver = new ChromeDriver(options);
        
		//ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.tatacliq.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();		
		
		WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		builder.moveToElement(watches).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		driver.findElement(By.xpath("//div[text()='Men']")).click();
		
		String mob1 = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		System.out.println("The mobile price is "+mob1);
		
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		
		for (WebElement each : price) {
			
			String MobilePrice = each.getText();			
			System.out.println(MobilePrice);
			
		}
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.xpath("//div[@class='ProductDescription__content']/h2"));
		
		driver.executeScript("arguments[0].click();",findElement );
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		String mob2 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String[] split = mob2.split(":");
		String trimmed = split[1].trim();
		//System.out.println("The mobile price is "+mob1);
		System.out.println("The mobile price is "+trimmed);
		
		if(mob1.equals(trimmed)) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String noOfCartItems = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println(noOfCartItems);
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		
		Thread.sleep(1000);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/cart.png");
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
	}
}



