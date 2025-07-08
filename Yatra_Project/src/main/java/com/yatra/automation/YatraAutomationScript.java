package com.yatra.automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraAutomationScript {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeoptions=new ChromeOptions();
		
		chromeoptions.addArguments("--disable-notifications");
		
		
		
		//Launch the browser
		WebDriver wd= new ChromeDriver(chromeoptions);
		
		WebDriverWait wait=new WebDriverWait(wd, Duration.ofSeconds(20));

		
		wd.get("https://www.yatra.com");
		
		wd.manage().window().maximize();
		
		By departureFromlocator=By.xpath("//input[@id='input-with-icon-adornment']");
		
		WebElement DepartureFrom=wait.until(ExpectedConditions.elementToBeClickable(departureFromlocator));
		
		DepartureFrom.sendKeys("Pune");
		
		By GoingtoLocator=By.xpath("//input[@id='input-with-icon-adornment']");
		
		WebElement GoingtTo=wait.until(ExpectedConditions.elementToBeClickable(GoingtoLocator));
		
		GoingtTo.sendKeys("Kolkata");
		
		
		
		//wd.findElement(By.xpath("//div[@aria-label=\"Departure Date inputbox\" and @role=\"button\"]")).click();
		
		By depatureDatelocator=By.xpath("//div[@aria-label=\"Departure Date inputbox\" and @role=\"button\"]");
		
		
		WebElement Departuredate=wait.until(ExpectedConditions.elementToBeClickable(depatureDatelocator));
		
		//WebElement Departuredate=wd.findElement(depatureDatelocator);
		

		Departuredate.click();
		
		By CalanderMonthLocator= By.xpath("//div[@class=\"react-datepicker__month-container\"]");
		
		//List<WebElement> Calendermonth=wd.findElements(CalanderMonthLocator);
		
		List<WebElement> CalendermonthList=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CalanderMonthLocator)); //synchronised
		
		System.out.println(CalendermonthList.size());
		
		//System.out.println(CalendermonthList.get(0));
		
		WebElement junemonthElement=CalendermonthList.get(1);
		
		Thread.sleep(2000);
		
		By PriceLocator =By.xpath(".//span[contains(@class,\"custom-day-content\")]");
		
		List<WebElement> junePriceList=junemonthElement.findElements(PriceLocator);
		
		int LowestPrice=Integer.MAX_VALUE;
		
		WebElement PriceElement=null;
		
		for(WebElement Price : junePriceList) {
			
			
			
			//System.out.println(Price.getText());
			
			String PriceString =Price.getText();
			if(PriceString.length() > 0) {
			
			PriceString=PriceString.replace("₹", "").replace(",", "");
			
			int PriceInt= Integer.parseInt(PriceString);
			
			if(PriceInt < LowestPrice) {
				
				LowestPrice = PriceInt;
				PriceElement=Price;
				
			}
			}
		}
		
		System.out.println(LowestPrice);
		
		WebElement DateElement=PriceElement.findElement(By.xpath(".//../.."));
		
		System.out.println(DateElement.getAttribute("aria-label"));
		

		wd.quit();
		

	}

}
