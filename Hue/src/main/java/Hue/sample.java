package Hue;

import java.util.Base64;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class sample {
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
		driver.get("http://demo.gethue.com/hue/editor/?type=hive");
		driver.findElement(By.id("id_username")).sendKeys("demo");
		driver.findElement(By.id("id_password")).sendKeys("demo");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).click();
		driver.manage().deleteAllCookies();
		driver.quit();
		}
}