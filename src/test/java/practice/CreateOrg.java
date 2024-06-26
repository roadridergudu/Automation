package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrg {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("http://localhost:8888/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("flipkartt");
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
	String actText=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(actText.contains("flipkartt")) {
		System.out.println("Org is created TC is pass");
	}
	else {
		System.out.println("TC is failed");
	}
	WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[text()=\"Sign Out\"]")).click();
	
}
}
