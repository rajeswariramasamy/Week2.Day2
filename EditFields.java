package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver().setup();
	//	ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		 WebDriverManager.edgedriver().setup();
		 EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/Edit.html");
		
		
		WebElement findemail = driver.findElement(By.id("email"));
		findemail.sendKeys("rajeswari.com@gmail.com");
		
		WebElement appendTxt = driver.findElement(By.xpath("//label[contains(text(),'Append a text')]/following-sibling::input"));
		String str = appendTxt.getAttribute("value");
		String str1 = "text";
		appendTxt.clear();
		appendTxt.sendKeys(str+str1);
		appendTxt.sendKeys(Keys.TAB);
		
		WebElement getDefault = driver.findElement(By.xpath("//label[contains(text(),'Get default')]/following-sibling::input[@name='username']"));
		String att = getDefault.getAttribute("value");
		System.out.println(att);
		
		WebElement clearEle = driver.findElement(By.xpath("//label[contains(text(),'Clear')]/following-sibling::input[@name='username']"));
		clearEle.clear();
		
		WebElement findDis = driver.findElement(By.xpath("//label[contains(text(),'Confirm that')]/following-sibling::input[@type='text']"));
		boolean dis = findDis.isDisplayed();
		System.out.println(dis);
		String color = findDis.getCssValue("background-color");
		System.out.println(color);
		String asHex = Color.fromString(color).asHex();
		System.out.println(asHex);
	}

}
