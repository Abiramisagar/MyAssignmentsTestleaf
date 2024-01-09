package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/. .");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		/*Click on Create Lead*/
	    driver.findElement(By.linkText("Create Lead")).click();
	    /*Enter the CompanyName*/
	    driver.findElement(By.xpath("//input[contains(@id, 'companyName')]")).sendKeys("TestLeaf");

	    /*Enter the FirstName*/
	    driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Abirami");

	    /*Enter the LastName*/
	    driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']")).sendKeys("sagar");
	    /*Enter phone number*/
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("456-7890");
	    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
	    /*Click create lead*/
	    driver.findElement(By.className("smallSubmit")).click();
	    

		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text() = 'Phone']")).click();
		
		//driver.findElement(By.xpath("//input[@name = 'phoneCountryCode']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@name = 'phoneAreaCode']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@name = 'phoneNumber']")).sendKeys("456-7890");
		
		driver.findElement(By.xpath("//button[text() ='Find Leads']")).click();
		
		Thread.sleep(100);
		
		String leadId = driver.findElement(By.xpath("//div[contains(@class, 'col-partyId')]/a")).getText();
		
		System.out.println("LeadId = "+leadId);
		
		driver.findElement(By.xpath("//div[contains(@class, 'col-partyId')]/a")).click();
		
		driver.findElement(By.xpath("//a[text() ='Delete']")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(leadId);
		
		driver.findElement(By.xpath("//button[text() = 'Find Leads']")).click();			
		
		driver.close();
		
	}

}
