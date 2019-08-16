
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


import java.util.Set;




import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario10 {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//iframe[@id='chat-widget']")).click();

		Thread.sleep(1000);
		Set<String> win = driver.getWindowHandles();
		System.out.println(win.size());
		driver.findElement(By.xpath("//div[@class='lc-1h9260c eptvlbh0']/input[@autocomplete='name']")).sendKeys("nithya");
		driver.findElement(By.xpath("//div/input[@id='email']")).sendKeys("dudesweety401@gmail.com");
		driver.findElement(By.xpath("//div/input[@id='name_146917605549304831']")).sendKeys("9898562587");
		driver.findElement(By.xpath("//form/div/button[@class='lc-yp53ho esv0owm0']")).click();
		Thread.sleep(2000);
		System.out.println("The automated message is as following.");
		System.out.println(
				driver.findElement(By.xpath("//div[@class='lc-1glynz2 eovu8nx0']/span[@class='Linkify']")).getText());

		Thread.sleep(5000);
		driver.close();
		
	}
}

