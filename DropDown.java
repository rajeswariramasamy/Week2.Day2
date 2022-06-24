package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WebDriverManager.chromedriver().setup();
		// ChromeDriver driver = new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		// WebDriverManager.edgedriver().setup();
		// EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select s = new Select(dd1);
		s.selectByIndex(1);

		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select s1 = new Select(dd2);
		s1.selectByVisibleText("Selenium");

		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(dd3);
		s2.selectByValue("1");

		WebElement dd4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s3 = new Select(dd4);
		List<WebElement> op = s3.getOptions();

		System.out.println(op.size());

		WebElement dd5 = driver.findElement(By.xpath("//option[contains(text(),'sendKeys')]//parent::select"));
		dd5.sendKeys("Selenium");

		WebElement dd6 = driver.findElement(By.xpath("//option[contains(text(),'programs')]//parent::select"));
		Select s4 = new Select(dd6);
		s4.selectByVisibleText("Appium");

	}

}
