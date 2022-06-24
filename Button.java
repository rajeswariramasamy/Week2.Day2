package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement findPos = driver.findElement(By.xpath("//button[@id='position']"));
		System.out.println("Location is: "+findPos.getLocation());		
		
		WebElement findColor = driver.findElement(By.xpath("//button[@id='color']"));
		String cssValue1 = findColor.getCssValue("background-color");
		String asHex1 = Color.fromString(cssValue1).asHex();
		System.out.println(cssValue1);
		System.out.println("Color is:" + asHex1);
		
		WebElement findSize = driver.findElement(By.xpath("//button[@id='size']"));
		
		System.out.println("Size is: "+findSize.getSize());
		
		WebElement clickHome = driver.findElement(By.xpath("//button[@id='home']"));
		clickHome.click();
	}
	

}
