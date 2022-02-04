package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moneycontrol {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Joe\\eclipse-workspace\\SeleniumTasks\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.moneycontrol.com/markets/fno-market-snapshot?classic=true");
		driver.manage().window().maximize();
		
		WebElement fostatsss = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		//ss
		File s = fostatsss.getScreenshotAs(OutputType.FILE);
		

		File d = new File ("C:\\Users\\Joe\\Pictures\\Saved Pictures\\joe.png");
		
		//copy file
		
		FileUtils.copyFile(s,d);
		

	}

}
