package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("SelTester");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select industry = new Select(driver.findElement(By.name("industryEnumId")));
		
		industry.selectByVisibleText("Computer Software");
		
		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		
		ownership.selectByVisibleText("S-Corporation");
		
		Select source = new Select(driver.findElement(By.id("dataSourceId")));
		
		source.selectByValue("LEAD_EMPLOYEE");
		
		Select marcamp = new Select(driver.findElement(By.id("marketingCampaignId")));
		
		marcamp.selectByIndex(6);
		
		Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		
		state.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		

	}

}
