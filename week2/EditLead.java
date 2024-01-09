package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
	    driver.get("http://leaftaps.com/opentaps/. .");
		
	    driver.manage().window().maximize();
		
	    /*Enter the Username*/
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
	    /*Enter the Password*/
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	    /*Click on the Login Button*/		
	    driver.findElement(By.className("decorativeSubmit")).click();

	    /*Click on the CRM/SFA Link*/
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();

	    /*Click on the Leads Button*/
	    driver.findElement(By.linkText("Leads")).click();

	    /*Click on Create Lead*/
	    driver.findElement(By.linkText("Create Lead")).click();

	    /*Enter the CompanyName*/
	    driver.findElement(By.xpath("//input[contains(@id, 'companyName')]")).sendKeys("TestLeaf");

	    /*Enter the FirstName*/
	    driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']")).sendKeys("Abirami");

	    /*Enter the LastName*/
	    driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']")).sendKeys("sagar");

	    /*Enter the FirstName (Local)*/
	    driver.findElement(By.xpath("//input[contains(@id, 'firstNameLocal')]")).sendKeys("Abi");
	    
	    /*Enter department name in the Department Field */
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	    
	    /*Enter text in the Description Field*/
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead");
	    
	    /*Enter your email in the E-mail address Field */
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abi@gmail.com");
	    
	    /* Select State/Province as NewYork Using Visible Text*/
	    Select state =new Select(driver.findElement(By.xpath("//select[contains(@name, 'StateProvinceGeoId')]")));
	    state.selectByValue("NY"); 
	    
	    /*Click on the Create Button*/
	    driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
	    
	    /*Click on the edit button*/
	    driver.findElement(By.linkText("Edit")).click();
	    
	    /*Clear the Description Field*/
	    driver.findElement(By.id("updateLeadForm_description")).clear();
	    
	    /*Fill the Important Note Field with Any text*/
	    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description cleared and updated");
	    
	    /*Click on the update button*/
	    driver.findElement(By.xpath("//input[@value = 'Update']")).click();
	    
	    /*Get the Title of the Resulting Page*/
	    String tittleAftUpdate = driver.getTitle(); 
	    System.out.println("Current page Tittle= "+tittleAftUpdate);
	    
	    /*Close the browser window*/
	    driver.close();
	    
}
}