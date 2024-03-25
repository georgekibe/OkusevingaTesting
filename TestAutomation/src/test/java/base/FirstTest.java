package base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		// OKUSEVINGA
		driver.get("http://localhost:4200/");
		driver.manage().window().maximize();

		// log in
		driver.findElement(By.xpath("//button[@id='signin-button']")).click();
//		Thread.sleep(500);
		driver.findElement(By.id("Username")).sendKeys("TestFundmanager");
		driver.findElement(By.id("Password")).sendKeys("Pass123$");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		
		driver.findElement(By.xpath("//i[@class='fa fa-desktop']")).click();

		
		// Creating a Bank
		driver.findElement(By.xpath("//div[contains(text(),'Banks')]")).click();
		driver.findElement(By.xpath("//button[@id='add-button']//span[@class='mat-mdc-button-touch-target']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'bankType')]")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//div[@data-custom-attribute='bankTypeOptions'][contains(text(), 'Commercial Bank')]")).click();
		driver.findElement(By.xpath("//*[contains(@id, '_name')]")).sendKeys("Test Bank 1");
		driver.findElement(By.xpath("//input[contains(@id, '_code')]")).sendKeys("TB1");
		driver.findElement(By.xpath("//*[contains(@id, 'swiftCode')]")).sendKeys("SWSTB1");
		WebElement saveButton =  driver.findElement(By.className("mdc-button__label"));
		Actions actions = new Actions(driver);
		actions.moveToElement(saveButton).click().perform();
		System.out.println("Bank created successfully");


		// Regions
		driver.findElement(By.xpath("//div[@class='menu-text ng-star-inserted'][contains(text(), 'Regions')]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-button\"]/span[4]")).click();
		driver.findElement(By.xpath("//div[contains(@id, 'countryID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='countryOptions'][contains(text(), 'Kenya')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, '_name')]")).sendKeys("Africa");
		driver.findElement(By.xpath("//div[contains(@id, '_riskThreshold')]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//div[@data-custom-attribute='riskThresholdOptions'][contains(text(), 'Low Risk')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'_code')]")).sendKeys("TAC");
		driver.findElement(By.xpath("//span[@class='mdc-button__label'][contains(text(), 'Save')]")).click();
		System.out.println("Region Created successfully");

		// Taxes
		driver.findElement(By.xpath("//div[@class='menu-text ng-star-inserted'][contains(text(), 'Taxes')]")).click();
		driver.findElement(By.xpath("//button[@id='add-button']//span[@class='mat-mdc-button-touch-target']")).click();
		driver.findElement(By.xpath("//div[contains(@id, '_countryID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='countryOptions'][contains(text(), 'Kenya')]"))
				.click();
		driver.findElement(By.xpath("//input[contains(@id, '_name')]")).sendKeys("[None]");
		driver.findElement(By.xpath("//div[contains(@id, '_currencyID')]")).click();
		driver.findElement(
				By.xpath("//div[@data-custom-attribute='currencyOptions'][contains(text(), 'Kenya Shilling')]"))
				.click();
		driver.findElement(By.xpath("//input[contains(@id, '_code')]")).sendKeys("001");
		driver.findElement(By.xpath("//span[@class='mdc-button__label'][contains(text(), 'Save')]")).click();
		System.out.println("Tax created successfully");

		// Bank Branches
		driver.findElement(By.xpath("//div[@class='menu-text ng-star-inserted'][contains(text(), 'Bank Branches')]")).click();
		driver.findElement(By.xpath("//button[@id='add-button']//span[@class='mat-mdc-button-touch-target']")).click();
		driver.findElement(By.xpath("//div[contains(@id, '_regionID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='regionOptions'][contains(text(), 'Africa')]")).click();
		driver.findElement(By.xpath("//div[contains(@id, '_bankID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='bankOptions'][contains(text(), 'BANK OF AFRICA KENYA LTD')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, '_name')]")).sendKeys("Main Office");
		driver.findElement(By.xpath("//input[contains(@id, '_code')]")).sendKeys("BOAK");
		driver.findElement(By.xpath("//input[contains(@id, '_dayCount')]")).sendKeys("100");   // This is useless
		driver.findElement(By.xpath("//div[contains(@id, '_taxID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='taxOptions'][contains(text(), '[None]')]")).click(); //update tax table first the click options here
		driver.findElement(By.xpath("//input[contains(@id, '_marketClosing')]")).sendKeys("03/16/2024");
		driver.findElement(By.xpath("//div[contains(@id, '_rounding')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='roundingOptions'][contains(text(), '[None]')]")).click();
		driver.findElement(By.xpath("//span[@class='dx-checkbox-icon']")).click();
//		driver.findElement(By.xpath("//div[@class='dx-widget dx-checkbox dx-state-focused dx-state-hover dx-validator dx-visibility-change-handler']//span[@class='dx-checkbox-icon']")).click();
		// above check box issues
		driver.findElement(By.xpath("//span[@class='mdc-button__label'][contains(text(), 'Save')]")).click();
		System.out.println("Bank branch created successfully.");
		
		
		//Broker
		
		driver.findElement(By.xpath("//div[@class= 'menu-text ng-star-inserted'][contains(text(), 'Brokers')]")).click();
		driver.findElement(By.xpath("//button[@id='add-button']//span[@class='mat-mdc-button-touch-target']")).click();
		driver.findElement(By.xpath("//div[contains(@id, '_countryID')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute='countryOptions'][contains(text(), 'Kenya')]"))
				.click();
		driver.findElement(By.xpath("//input[contains(@id, '_name')]")).sendKeys("[None]");
		driver.findElement(By.xpath("//input[contains(@id, '_code')]")).sendKeys("None");
		driver.findElement(By.xpath("//div[contains(@id, '_paymentMode')]")).click();
		driver.findElement(By.xpath("//div[@data-custom-attribute = 'paymentModeOptions'][contains(text(), 'Cash')]")).click();
		driver.findElement(By.xpath("//span[@class='mdc-button__label'][contains(text(), 'Save')]")).click();
		System.out.println("Broker created successfully.");
		
		
		//Broker cash Account setup
		
		driver.findElement(By.xpath("//div[@class='menu-text ng-star-inserted'][contains(text(),'Broker Cash Accounts']")).click();
		driver.findElement(By.xpath("//button[@id='add-button']//span[@class='mat-mdc-button-touch-target']")).click();
		driver.findElement(By.xpath("//div[contains(@id, '_brokerID]")).click();
		
		
		

	}

}
