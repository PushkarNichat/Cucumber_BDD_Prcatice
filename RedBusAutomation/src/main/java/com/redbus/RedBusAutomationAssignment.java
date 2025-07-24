package com.redbus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class RedBusAutomationAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		//I want to launch Browser
		
		WebDriver wd=new ChromeDriver(chromeOptions);
		
		Thread.sleep(2000);
		
		//wd is a reference variable of parent type
		//Parent p=new Child();
		
		//Visit redbus website !!
		wd.get("https://www.redbus.in/");
		
		
		
		
		
		

	}

}
