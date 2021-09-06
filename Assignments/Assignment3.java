import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.indiatimes.com/");

		driver.manage().window().maximize();
		
		System.out.println("Task 1 -- Verify Header Options");

		boolean s1 = driver.findElement(By.xpath("//span[contains(text(),'Videos')]")).isDisplayed();

		System.out.println("Videos--"+s1);
		
		boolean s2 = driver.findElement(By.xpath("//body/div[@id='indiatimes_app_id']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).isDisplayed();

		System.out.println("News--"+s2);
		
		boolean s3 = driver.findElement(By.xpath("//body/div[@id='indiatimes_app_id']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")).isDisplayed();
		System.out.println("Technology--"+s3);
		
		System.out.println("Task 2 -- Print Links");

		String s4 = driver.findElement(By.xpath("//a[normalize-space()='About Us']")).getAttribute("href");

		System.out.println("About Us--"+s4);

		String s5 = driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).getAttribute("href");

		System.out.println("Terms & Conditions--"+s5);

		String s6 = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).getAttribute("href");

		System.out.println("Contact Us--"+s6);

		String s7 = driver.findElement(By.xpath("//body/div[@id='indiatimes_app_id']/div[1]/div[1]/footer[1]/div[1]/div[2]/div[7]/a[4]")).getAttribute("href");

		System.out.println("Policy--"+s7);

		String s8 = driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]")).getAttribute("href");

		System.out.println("Sitemap--"+s8);
		
        System.out.println("Task 3 -- Print Trending News");
		
		Thread.sleep(2000);
		
		WebElement Trend =driver.findElement(By.xpath("//body/div[@id='indiatimes_app_id']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[7]/a[1]/span[1]"));
		WebElement human =driver.findElement(By.xpath("//a[contains(text(),'Human Interest')]"));
		
		Actions aa= new Actions (driver);
		aa.moveToElement(Trend);
		aa.moveToElement(human).click().perform();
		
		Thread.sleep(2000);
		WebElement first =driver.findElement(By.xpath("//a[contains(text(),'Wholesome Moment: Afghan Girl Skips And Hops About')]"));
		aa.moveToElement(first);
		String fnews =first.getText();
		
		System.out.println("first news--"+fnews);
		
		Thread.sleep(2000);
		
		WebElement second =driver.findElement(By.xpath("//a[contains(text(),'Meet Bhavina Patel Who Scripted History At Tokyo P')]"));
		aa.moveToElement(second);
		String snews =second.getText();
		System.out.println("second news--"+snews);
		WebElement third =driver.findElement(By.xpath("//a[contains(text(),\"Watch: Young Girl Kisses Infant After Family's Eva\")]"));
		aa.moveToElement(third);
		String tnews =third.getText();
		System.out.println("third news--"+tnews);
		
		Thread.sleep(2000);
		WebElement fourth =driver.findElement(By.xpath("//a[contains(text(),'Man-Daughter Recreate Maternity Pictures He Took W')]"));
		aa.moveToElement(fourth);
		String founews =fourth.getText();
		System.out.println("fourth news--"+founews);
		
		Thread.sleep(2000);
		WebElement fifth =driver.findElement(By.xpath("//a[contains(text(),'Heart-Stopping Video Shows Man Rescuing His Dog In')]"));
		aa.moveToElement(fifth);
		String fifthnews =fifth.getText();
		System.out.println("fifth news--"+fifthnews);
		
        System.out.println("Task 4 -- Print IPL 2021 News");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.indiatimes.com/");

		driver.findElement(By.xpath("//a[@class='quick-slider-slide'][normalize-space()='IPL 2021']")).click();
		
		Thread.sleep(2000);
		WebElement kkr1=driver.findElement(By.xpath("//a[contains(text(),'Match Between KKR And RCB Postponed After 2 Kolkat')]"));
		aa.moveToElement(kkr1);
		String kkrnews=kkr1.getText();
		System.out.println("kkr first news--"+kkrnews);
		
		Thread.sleep(2000);
		WebElement kkr2=driver.findElement(By.xpath("//a[contains(text(),'Cummins Has The Likes Of Gayle And Sehwag For Comp')]"));
		aa.moveToElement(kkr2);
		String kkrnews2=kkr2.getText();
		System.out.println("kkr second news--"+kkrnews2);
		
		Thread.sleep(2000);
		WebElement kkr3=driver.findElement(By.xpath("//a[contains(text(),'Cummins Has The Likes Of Gayle And Sehwag For Comp')]"));
		aa.moveToElement(kkr3);
		String kkrnews3=kkr3.getText();
		System.out.println("kkr third news--"+kkrnews3);
		
		
		driver.close();

		

	}

}
