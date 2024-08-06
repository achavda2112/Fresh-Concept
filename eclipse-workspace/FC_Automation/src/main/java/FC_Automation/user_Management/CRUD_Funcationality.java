package FC_Automation.user_Management;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FC_Automation.webDriverManager;

public class CRUD_Funcationality {
	
	public void deleteUser() {
		WebDriver driver = webDriverManager.getDriver();
		if (driver == null) {
			System.out.println("Driver initialization failed.");
			return;
		}
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.SearchUsers)))
					.sendKeys(user_ManageMent_TestData.User_Name);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.ClickOnUser))).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.DeleteUser))).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.ConfirmSubmit)))
					.click();
			Thread.sleep(5000);
			WebDriverWait waitForToast = new WebDriverWait(driver, Duration.ofSeconds(10));
			waitForToast.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(usermanangement_Locators.DeleteUserConfirmation)));
			String textTest = driver.findElement(By.xpath(usermanangement_Locators.DeleteUserConfirmation)).getText();
			System.out.println("User Delete Confirmation Toast is displayed: " + textTest);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	

	public  void addNEwUser() {
		WebDriver driver = webDriverManager.getDriver();
		if (driver == null) {
			System.out.println("Driver initialization failed.");
			return;
		}

		try {
			// Adding new user
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.AdminMenu)));
			WebElement ele = driver.findElement(By.xpath(usermanangement_Locators.AdminMenu));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Users))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.AddUsers))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.FisrtName)))
					.sendKeys(user_ManageMent_TestData.FIRST_NAME);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.LastName)))
					.sendKeys(user_ManageMent_TestData.LAST_NAME);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Username)))
					.sendKeys(user_ManageMent_TestData.User_Name);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Password)))
					.sendKeys(user_ManageMent_TestData.PASSWORD);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.ConfirmPassword)))
					.sendKeys(user_ManageMent_TestData.ConfirmPassword);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.StartDate)))
					.isDisplayed();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Email)))
					.sendKeys(user_ManageMent_TestData.Email);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Phone)))
					.sendKeys(user_ManageMent_TestData.PhoneNumber);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Save))).click();
			Thread.sleep(5000);
			WebDriverWait waitForToast = new WebDriverWait(driver, Duration.ofSeconds(5));

			waitForToast.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath(usermanangement_Locators.UserCreationToast)));
			String textTest = driver.findElement(By.xpath(usermanangement_Locators.UserCreationToast)).getText();
			System.out.println("User Creation Confirmation Toast is displayed: " + textTest);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editUser() {
		WebDriver driver = webDriverManager.getDriver();
		if (driver == null) {
			System.out.println("Driver initialization failed.");
			return;
		}
		try {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.SearchUsers)))
					.sendKeys(user_ManageMent_TestData.User_Name);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.ClickOnUser))).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.FisrtName))).clear();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.FisrtName)))
					.sendKeys(user_ManageMent_TestData.FIRST_NAME_EDITED);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.LastName))).clear();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.LastName)))
					.sendKeys(user_ManageMent_TestData.LAST_NAME_EDITED);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Phone))).clear();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Phone)))
					.sendKeys(user_ManageMent_TestData.PhoneNumberEdited);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(usermanangement_Locators.Save))).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
