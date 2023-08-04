package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebElement roundTripOption = 
		driver.findElement(By.xpath("(//button[contains(@class,'flex flex-middle')])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Round trip']")).click();
	    //Select RT = new Select(roundTripOption);
		//RT.selectByIndex(1);
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Chennai",Keys.TAB);
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("New York",Keys.TAB);
		
	}

}
