import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();

		
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@id='mountRoot']//div[2]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//a[1]//div[1]//picture[1]//img[1]"))
				.click();
                

		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));

		Actions aa = new Actions(driver);
		aa.moveToElement(sort);
		WebElement what = driver.findElement(By.xpath("//label[normalize-space()=\"What's New\"]"));
		aa.moveToElement(what).click().perform();
           
                driver.findElement(
				By.xpath("//label[normalize-space()='Women']"))
				.click();
                Thread.sleep(2000);

		driver.findElement(
				By.xpath("//div[@class='vertical-filters-filters brand-container']//li[1]//label[1]//div[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul[@class='price-list']//li[1]//label[1]//div[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[normalize-space()='20% and above']")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//li[1]//a[1]//div[2]//div[1]//span[1]//span[1]")).click();

		Set<String> srr = driver.getWindowHandles();

		Iterator<String> iter = srr.iterator();

		String parentid = iter.next();
		String childid = iter.next();

		driver.switchTo().window(childid);
		driver.findElement(By.xpath(
				"//p[@class='size-buttons-unified-size']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//div[@class='pdp-description-container']//div[3]//div[1]//div[1]"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		Thread.sleep(2000);

		WebElement s1 = driver
				.findElement(By.xpath("//body/div[contains(@class,'layout')]/div[@id='mountRoot']/div[@id='appContent']/div[contains(@class,'')]/div/div/div/div[contains(@class,'desktop-base-cartLayout')]/div[contains(@class,'itemBlock-base-leftBlock')]/div[@id='cartItemsList']/div[contains(@class,'itemContainer-base-itemMargin')]/div/div[contains(@class,'item-base-item')]/div[contains(@class,'itemContainer-base-item')]/div[contains(@class,'itemContainer-base-itemRight')]/div[contains(@class,'itemContainer-base-details')]/div[1]"));

		if (s1.isDisplayed()) {
			System.out.println("product is present in the bag");
		} else {
			System.out.println("product is not present in the bag");
		}

		Thread.sleep(2000);
		
		WebElement wish = driver.findElement(By.xpath(
				"//button[normalize-space()='Move to WishList']"));

		aa.doubleClick(wish).perform();
		
		System.out.println("Task completed");
		driver.quit();


	}

}
