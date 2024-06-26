package com.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Java_Script_Executor {


public static void main(String[] args) throws Throwable {
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(5000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-2000)");
	
}
}

