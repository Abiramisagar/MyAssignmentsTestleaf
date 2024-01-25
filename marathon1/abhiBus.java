package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhiBus {

	public static void main(String[] args) {
		
		ChromeDriver abhiBus = new ChromeDriver();
		
		abhiBus.get(" https://www.abhibus.com/");
		
		abhiBus.manage().window().maximize();
		
		abhiBus.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		abhiBus.findElement(By.xpath("//input[@placeholder = 'From Station']")).sendKeys("chennai");
		
		abhiBus.findElement(By.xpath("//li[@data-id = 'Chennai']")).click();
		
		abhiBus.findElement(By.xpath("//input[@placeholder = 'To Station']")).sendKeys("Banglore");
		
		abhiBus.findElement(By.xpath("//li[@data-id = 'Bangalore']")).click();
		
		abhiBus.findElement(By.linkText("Tomorrow")).click();
		
		String busName = abhiBus.findElement(By.xpath("//h5[@class = 'title'][1]")).getText();
		
		System.out.println("First Bus Name = "+busName);
		
		abhiBus.findElement(By.xpath("//span[text() = 'Sleeper']")).click();
		
		String SlBusNam = abhiBus.findElement(By.xpath("(//h5[@class ='title'])[1]")).getText();
		
		System.out.println("Selected Bus Name =" +SlBusNam);
		
		String avlSeat = abhiBus.findElement(By.xpath("//small[text() =' Seats Available']")).getText();
		
		System.out.println("Seats Available = "+avlSeat);
		
		abhiBus.findElement(By.xpath("(//button[text() = 'Show Seats'])[1]")).click();
		
		abhiBus.findElement(By.xpath("(//button[@class= 'seat sleeper'])[1]")).click();
		
		abhiBus.findElement(By.xpath("(//input[@class= 'primary  '])[2]")).click();
		
		abhiBus.findElement(By.xpath("(//input[@class= 'primary  '])[3]")).click();
		
		String seatSel = abhiBus.findElement(By.xpath("(//span[@class = 'text-primary'])[1]")).getText();
		
		System.out.println("Seat Selected = "+seatSel);
		
		String busFare = abhiBus.findElement(By.xpath("(//span[@class = 'text-primary'])[2]")).getText();
		
		System.out.println("BusFare = "+busFare);
		
		String pgTitle = abhiBus.getTitle();
		
		System.out.println("Page Title = "+pgTitle);
		
		//abhiBus.close();
	}

}
