package Hue;


import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class sample1 {
	public static void check() throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver",
				"C:\\NewBeginning\\IEDriverServer.exe");

		DesiredCapabilities capabilitiesIE = DesiredCapabilities
				.internetExplorer();
		capabilitiesIE
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		capabilitiesIE.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		capabilitiesIE.setCapability("ie.ensureCleanSession", true);
		
		
		WebDriver driver = new InternetExplorerDriver (capabilitiesIE);
		//driver.get("www.google.com");
		driver.get("http://demo.gethue.com/hue/editor/?type=hive");
		Thread.sleep(3000);
		driver.findElement(By.id("id_username")).sendKeys("demo");
		driver.findElement(By.id("id_password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[3]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[3]/div[1]/ul/li[4]/a")).click();
		driver.quit();
		}
}
