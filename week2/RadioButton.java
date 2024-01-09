package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		
		//driver.findElement(By.id("j_idt87:console1:0")).click();
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[12]/div[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[18]/div[2]")).click();
		boolean selected = driver.findElement(By.id("j_idt87:city2:2")).isSelected();
		System.out.println("Browser Selected = "+selected);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[18]/div[2]")).click();
		boolean againSelected = driver.findElement(By.id("j_idt87:city2:2")).isSelected();
		System.out.println("Browser Selected = "+againSelected);
		
		boolean chrome = driver.findElement(By.id("j_idt87:console2:0")).isSelected();
		boolean fireFox = driver.findElement(By.id("j_idt87:console2:1")).isSelected();
		boolean safari = driver.findElement(By.id("j_idt87:console2:2")).isSelected();
		//boolean edge = driver.findElement(By.id("j_idt87:console2:3")).isSelected();
		
		if(chrome) {
			System.out.println("Default selected browser is Chrome ");
		}
		else if(fireFox) {
			System.out.println("Default selected browser is fireFox ");
		}
		else if(safari) {
			System.out.println("Default selected browser is safari ");	
		}
		else {
			System.out.println("Default selected browser is edge ");
		}
		 		
		
		boolean ageGrp1 = driver.findElement(By.id("j_idt87:age:0")).isSelected();
		boolean ageGrp2 = driver.findElement(By.id("j_idt87:age:1")).isSelected();
		//boolean ageGrp3 = driver.findElement(By.id("j_idt87:age:2")).isSelected();
		
		if(ageGrp1) {
			System.out.println("Selected age group is 1-20 years ");
		}
		else if(ageGrp2) {
			System.out.println("Selected age group is 21-40 years  ");
		}
		else {
			System.out.println("Selected age group is 41-60 years  ");
		}	

	}

}
