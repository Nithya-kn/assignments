import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException

	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.navigate().to("https://www.bluestone.com/");
		WebElement item = driver.findElement(By.xpath("//li[@class=\"menuparent\"]"));		
		a.moveToElement(item).perform();
		driver.findElement(By.xpath("//span[@data-p=\"mens-jewellery-kadas,m\"]")).click();	
		driver.findElement(By.xpath("//img[@class=\"hc img-responsive center-block\"]")).click();
		driver.findElement(By.id("buy-now")).click();
		WebElement ele = driver.findElement(By.xpath("//div[@class=\"formErrorContent\"]"));
		System.out.println(ele.getText());
		driver.quit();
}
}

