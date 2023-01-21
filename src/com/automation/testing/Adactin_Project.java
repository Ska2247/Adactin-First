package com.automation.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	private static final String FileUtils = null;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "F:\\Project\\Automation_Project\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://adactinhotelapp.com/index.php");

		WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("Karthi224");

		WebElement Pass = driver.findElement(By.xpath("//input[@name='password']"));
		Pass.sendKeys("1234567");

		WebElement Login_Btn = driver.findElement(By.xpath("//input[@name='login']"));
		Login_Btn.click();

		WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));

		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));

		WebElement Room_Type = driver.findElement(By.xpath("//select[@id='room_type']"));

		WebElement Room_Nos = driver.findElement(By.xpath("//select[@id='room_nos']"));

		Select a = new Select(Location);
		a.selectByIndex(3);

		Select b = new Select(Hotel);
		b.selectByVisibleText("Hotel Sunshine");

		Select c = new Select(Room_Type);
		c.selectByVisibleText("Deluxe");

		Select d = new Select(Room_Nos);
		d.selectByIndex(2);

		// WebElement Check_In =
		// driver.findElement(By.xpath("//input[@id='datepick_in']"));
		// Check_In.sendKeys("17/12/2022");

		// WebElement Check_Out =
		// driver.findElement(By.xpath("//input[@id='datepick_out']"));
		// Check_Out.sendKeys("22/12/2022");

		WebElement Adults = driver.findElement(By.xpath("//select[@id='adult_room']"));

		WebElement Child = driver.findElement(By.xpath("//select[@id='child_room']"));

		Select e = new Select(Adults);
		e.selectByIndex(3);

		Select f = new Select(Child);
		f.selectByIndex(1);

		WebElement Search_Btn = driver.findElement(By.xpath("//input[@id='Submit']"));
		Search_Btn.click();

		WebElement Radio_Btn = driver.findElement(By.xpath("//input[@type='radio']"));
		Radio_Btn.click();

		WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
		Continue.click();

		WebElement First_Name = driver.findElement(By.xpath("//input[@name='first_name']"));
		First_Name.sendKeys("Karthick");

		WebElement Last_Name = driver.findElement(By.xpath("//input[@name='last_name']"));
		Last_Name.sendKeys("S");

		WebElement Address = driver.findElement(By.xpath("//textarea[@id='address']"));
		Address.sendKeys("Beach road,Tamilnadu,India");

		WebElement Credit_Card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		Credit_Card.sendKeys("1234567890123456");

		WebElement Card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));

		WebElement Expiry_Month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));

		WebElement Expiry_Year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));

		Select g = new Select(Card_type);
		g.selectByIndex(2);

		Select h = new Select(Expiry_Month);
		h.selectByIndex(3);

		Select i = new Select(Expiry_Year);
		i.selectByIndex(2);

		WebElement CVV = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		CVV.sendKeys("123");

		WebElement Booknow_Btn = driver.findElement(By.xpath("//input[@name='book_now']"));
		Booknow_Btn.click();

		WebElement My_Itinerary = driver.findElement(By.xpath("//a[.='Booked Itinerary']"));
		My_Itinerary.click();

		WebElement Logout = driver.findElement(By.xpath("//a[.='Logout']"));
		Logout.click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

        File file = new File("F:\\Project\\Adactin_Project\\snaps\\Adactin");
	
        FileUtils.       
	}

}
