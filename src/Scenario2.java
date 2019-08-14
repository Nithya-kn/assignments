
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class Scenario2 {

		static {
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();// casting
			driver.manage().window().maximize();// maximize the browser window
			driver.navigate().to(
					"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			driver.findElement(By.id("identifierId")).sendKeys("dudesweety401@gmail.com");// we can pass the value directly

			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("viveksweety13");

			driver.findElement(By.id("passwordNext")).click();

			Thread.sleep(2000);

			WebDriverWait ww = new WebDriverWait(driver, 10);
			if (ww.until(ExpectedConditions.titleContains("Inbox"))) {
				System.out.println("Successfully Logged In using Username and Password");
			}

			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
			;
			Thread.sleep(3000);

			driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("jalegakoyala@gmail.com");
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
			driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("This is a test mail.");

			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();

			Thread.sleep(3000);
			

		}

	}

