package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Anand_TestLeaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		
		WebElement industry_dropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industry_option = new Select(industry_dropdown);
		industry_option.selectByValue("IND_SOFTWARE");
		
		
		WebElement ownership_dropdown=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownership_option = new Select(ownership_dropdown);
		ownership_option.selectByVisibleText("S-Corporation");
		
		WebElement source_dropdown = driver.findElement(By.xpath("//select[@id='dataSourceId']")) ;
		Select source_option = new Select(source_dropdown);
		source_option.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketcampaign_dropdown = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketcampaign_option = new Select(marketcampaign_dropdown);
		marketcampaign_option.selectByIndex(6);
		
		
		WebElement stateprovince_dropdown = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateprovince_option = new Select(stateprovince_dropdown);
		stateprovince_option.selectByValue("TX");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		//driver.close();
	}

}
