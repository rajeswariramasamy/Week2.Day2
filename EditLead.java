package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");

		WebElement enterUser = driver.findElement(By.id("username"));
		enterUser.sendKeys("Demosalesmanager");

		WebElement enterPass = driver.findElement(By.id("password"));
		enterPass.sendKeys("crmsfa");

		WebElement clickSubmit = driver.findElement(By.className("decorativeSubmit"));
		clickSubmit.click();

		WebElement clickCrm = driver.findElement(By.linkText("CRM/SFA"));
		clickCrm.click();

		WebElement clickLeads = driver.findElement(By.linkText("Leads"));
		clickLeads.click();

		WebElement clickCreateLead = driver.findElement(By.linkText("Create Lead"));
		clickCreateLead.click();

		WebElement enterId = driver.findElement(By.id("createLeadForm_companyName"));
		enterId.sendKeys("Infosys");

		WebElement enterFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		enterFirstName.sendKeys("Nandakumar");

		WebElement enterSecondName = driver.findElement(By.id("createLeadForm_lastName"));
		enterSecondName.sendKeys("S");

		WebElement enterFirstLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		enterFirstLocal.sendKeys("Nandha");

		WebElement enterDepart = driver.findElement(By.id("createLeadForm_departmentName"));
		enterDepart.sendKeys("IVS");

		WebElement enterDesc = driver.findElement(By.id("createLeadForm_description"));
		enterDesc.sendKeys("Create Lead assignment");

		WebElement enterEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		enterEmail.sendKeys("rajeswari.rama12@gmail.com");

		WebElement enterState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(enterState);
		s.selectByVisibleText("New York");

		WebElement clickCreate = driver.findElement(By.className("smallSubmit"));
		clickCreate.click();

		WebElement clickEdit = driver.findElement(By.linkText("Edit"));
		clickEdit.click();
		
		WebElement clearDesc = driver.findElement(By.id("updateLeadForm_description"));
		clearDesc.clear();
		
		WebElement enterImp = driver.findElement(By.id("updateLeadForm_importantNote"));
		enterImp.sendKeys("First Webpage Assignment");
		
		WebElement clickSubmit1 = driver.findElement(By.name("submitButton"));
		clickSubmit1.click();
		
		System.out.println("The Page title is: "+driver.getTitle());
		

	}

}