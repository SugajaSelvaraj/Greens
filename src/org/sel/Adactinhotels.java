package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinhotels {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Joe\\eclipse-workspace\\SeleniumTasks\\driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver(); 
 driver.get("https://adactinhotelapp.com/index.php");
 driver.manage().window().maximize();
 
 WebElement usrnme = driver.findElement(By.id("username"));
 usrnme.sendKeys("chrisselvaraj");
 
 WebElement pass = driver.findElement(By.id("password"));
 pass.sendKeys("8D2X31");
 
 WebElement lgin = driver.findElement(By.id("login"));
 lgin.click();
 
WebElement loction = driver.findElement(By.id("location"));
Select select = new Select(loction);
select.selectByIndex(2);

WebElement hotel = driver.findElement(By.id("hotels"));
Select select1 = new Select(hotel);
select1.selectByIndex(3);

WebElement roomtyp = driver.findElement(By.id("room_type"));
Select select2 = new Select(roomtyp);
select2.selectByIndex(1); 

WebElement noofroom = driver.findElement(By.id("room_nos"));
Select select3 = new Select(noofroom);
select3.selectByIndex(2);

WebElement search = driver.findElement(By.id("Submit"));
search.click();

WebElement selct = driver.findElement(By.id("radiobutton_0"));
selct.click();

WebElement cont = driver.findElement(By.id("continue"));
cont.click();

WebElement frstname = driver.findElement(By.id("first_name"));
frstname.sendKeys("Chris");

WebElement lstname = driver.findElement(By.id("last_name"));
lstname.sendKeys("selvaraj");

WebElement billaddrs = driver.findElement(By.id("address"));
billaddrs.sendKeys("GreensTech,chennai -103");

WebElement cardno = driver.findElement(By.id("cc_num"));
cardno.sendKeys("1234567891012345");

WebElement cardtype = driver.findElement(By.id("cc_type"));
Select select4 = new Select(cardtype);
select4.selectByIndex(3);

WebElement selmonth = driver.findElement(By.id("cc_exp_month"));
Select select5 = new Select(selmonth);
select5.selectByIndex(12);

WebElement selyear = driver.findElement(By.id("cc_exp_year"));
Select select6 = new Select(selyear);
select6.selectByValue("2022");

WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("099");

WebElement book = driver.findElement(By.id("book_now"));
book.click();

Thread.sleep(6000);

WebElement findElement = driver.findElement(By.id("order_no"));
String attribute = findElement.getAttribute("value");
System.out.println(attribute);

driver.quit();





	}

}
