package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	Thread.sleep(5000);
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("satya");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rout");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("6372377676");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("satya@123");
	Thread.sleep(5000);
	WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Thread.sleep(5000);
	Select s=new Select(day);
	Thread.sleep(5000);
	s.selectByVisibleText("4");
	Thread.sleep(5000);
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Thread.sleep(5000);
	Select s1=new Select(month);
	Thread.sleep(5000);
	s1.selectByVisibleText("Apr");
	Thread.sleep(5000);
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Thread.sleep(5000);
	Select s2=new Select(year);
	Thread.sleep(5000);
	s2.selectByVisibleText("2003");
	Thread.sleep(5000);
driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
Thread.sleep(5000);
}
}
