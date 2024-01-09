package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@aria-label='Basic']/parent::div/following-sibling::div")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Ajax']/parent::div/following-sibling::div")).click();			
		
		driver.findElement(By.xpath("//input[@value='java']/parent::div/following-sibling::div")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'TriState_input')]/parent::div/following-sibling::div")).click();
		
		driver.findElement(By.xpath("//div[@class = \"ui-toggleswitch-slider\"]")).click();
		
		Boolean ChkBxSel = driver.findElement(By.xpath("(//div[@class = 'col-12'])[5]/div")).isSelected();
		
		//System.out.println(ChkBxSel);
		
		if(false == ChkBxSel) {
			
			System.out.println("The checkBox is disabled");
		}
		
		driver.findElement(By.xpath("//ul[@data-label = 'Cities']")).click();	
		
		driver.findElement(By.xpath("//input[@aria-label ='Select All']/parent::div/following-sibling::div")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'circle-close')]")).click();		

	}

}
