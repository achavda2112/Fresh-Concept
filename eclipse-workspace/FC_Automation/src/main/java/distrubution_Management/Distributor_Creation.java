package distrubution_Management;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import FC_Automation.Login_baseClass;
import FC_Automation.webDriverManager;

public class Distributor_Creation extends Login_baseClass{

	public static void distributor_Creation() {
		 WebDriver driver = webDriverManager.getDriver();
	        if (driver == null) {
	            System.out.println("Driver initialization failed.");
	            return;
	        }

	        try {
	        	 // Perform login
	            Login_baseClass login_baseClass = new Login_baseClass();
	            login_baseClass.login();

	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            
	            
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.distributor)));
	            WebElement ele = driver.findElement(By.xpath(xPathLocators.distributor));

	          //Creating object of an Actions class
	            Actions action1 = new Actions(driver);

	          //Performing the mouse hover action on the target element.
	            action1.moveToElement(ele).perform();
	 //Adding Distributor
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Adddistributor))).click();
    
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.DistributorName))).sendKeys(addDistributor_TestData.Distributor_NAME);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.ReportOrderSeq))).sendKeys(addDistributor_TestData.ReportOrderSeq);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Nickname))).sendKeys(addDistributor_TestData.DistributorNickName);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Address1))).sendKeys(addDistributor_TestData.Address1);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Address2))).sendKeys(addDistributor_TestData.Address2);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.City))).sendKeys(addDistributor_TestData.City);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Zip))).sendKeys(addDistributor_TestData.ZipCode);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Phone))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Phone))).sendKeys(addDistributor_TestData.Phone);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Phone))).sendKeys(Keys.TAB);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Fax))).sendKeys(addDistributor_TestData.Fax);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Email))).sendKeys(addDistributor_TestData.Email);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Website))).sendKeys(addDistributor_TestData.Website);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.MembershipLevel))).click();
    Select MembershipLevel = new Select(driver.findElement(By.xpath(xPathLocators.MembershipLevel)));
    MembershipLevel.selectByIndex(2);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Affiliation))).sendKeys(addDistributor_TestData.Affiliation); 
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.FileSelect)));
    WebElement upload =driver.findElement(By.xpath(xPathLocators.File));
    upload.sendKeys("/home/akash/Pictures/Screenshots/Screenshot from 2024-07-25 13-03-57.png");
    Thread.sleep(3000);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Next))).click();
    Thread.sleep(2000);
    
    
    //Page2
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.SupportSpecialist))).click();
    WebElement ProduceSupportSpecialist = driver.findElement(By.xpath(xPathLocators.SupportSpecialist));
    Select ProduceSupportSpecialist1 = new Select(ProduceSupportSpecialist);
    ProduceSupportSpecialist1.selectByIndex(5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.ReportOrderSeq))).sendKeys(addDistributor_TestData.ReportOrderSeq);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.ProcurementAnalyst))).click();
    WebElement FCProcurementAnalyst = driver.findElement(By.xpath(xPathLocators.ProcurementAnalyst));
    Select FCProcurementAnalyst1 = new Select(FCProcurementAnalyst);
    FCProcurementAnalyst1.selectByIndex(5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.EffectiveDay))).click();
    WebElement EffectiveDay = driver.findElement(By.xpath(xPathLocators.EffectiveDay));
    Select EffectiveDay1 = new Select(EffectiveDay);
    EffectiveDay1.selectByIndex(5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.priceVerificationEffectiveDay))).click();
    WebElement priceVerificationEffectiveDay = driver.findElement(By.xpath(xPathLocators.priceVerificationEffectiveDay));
    Select priceVerificationEffectiveDay1 = new Select(priceVerificationEffectiveDay);
    priceVerificationEffectiveDay1.selectByIndex(5);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.UsesUnitOfMeasure))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.AllowSundayDelivery))).click();
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.AnableNewDashboard))).click();
    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Active))).click();
   
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.StartDate))).click();
//    Thread.sleep(2000);
//    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.StartDate))).sendKeys(Keys.ESCAPE);
//    Thread.sleep(3000);
    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.StartDate))).clear();
//    Thread.sleep(2000);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.StartDate))).sendKeys(addDistributor_TestData.Start_Date);
//    Thread.sleep(2000);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.BepId))).sendKeys(addDistributor_TestData.BEP_ID);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.PaId))).sendKeys(addDistributor_TestData.PA_ID);

//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.vendorCode))).sendKeys(addDistributor_TestData.Vendor_Code);
//    wait.until(ExpectedConditions.elementToBeClickable(By.id(xPathLocators.SapratorValue))).click();
//    WebElement SaparatorValue = driver.findElement(By.id(xPathLocators.SapratorValue));
//    Select SaparatorValue1 = new Select(SaparatorValue);
//    SaparatorValue1.selectByIndex(2);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep2))).click();
    Thread.sleep(2000);
   
    
  
//    WebElement upload =driver.findElement(By.id(xPathLocators.File));
//    upload.sendKeys("/home/akash/Pictures/Screenshots/Screenshot from 2024-07-25 13-03-57.png");
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep2))).click();
//    Thread.sleep(2000);

    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.SearchShipper))).sendKeys(addDistributor_TestData.Shipper);
//    Thread.sleep(2000);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.SelectShipper))).isDisplayed();
//    Thread.sleep(2000);
//
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.SelectShipper))).click();
//    Thread.sleep(2000);
//
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.AddToSelected))).click();
    Thread.sleep(2000);
	webDriverManager.scrollToBottom();
    Thread.sleep(5000);    
    WebElement button = driver.findElement(By.xpath(xPathLocators.NextInStep3));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).isEnabled();
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).click();
    
    System.out.println("Next button is appeares");
//    clickWithRetry(By.xpath(xPathLocators.NextInStep3));


//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).click();

    Thread.sleep(2000);
    System.out.println("4th page is opened");
    Thread.sleep(5000);    

//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Acknowledgment))).isEnabled();
//    System.out.println("Acknowledgement is clickable");
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Acknowledgment))).click();
//    WebElement Acknowledgment = driver.findElement(By.id(xPathLocators.Acknowledgment));
//    Select Acknowledgment1 = new Select(Acknowledgment);
//    Acknowledgment1.selectByIndex(1);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).click();
    Thread.sleep(5000);    
    
	webDriverManager.scrollToBottom();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).isEnabled();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep3))).click();
    Thread.sleep(5000);    
	webDriverManager.scrollToBottom();

    	
//    WebElement OrderWritePath = driver.findElement(By.id(xPathLocators.OrderWritePath));
//    Select OrderWritePath1 = new Select(OrderWritePath);
//    OrderWritePath1.selectByIndex(1);
//   
//    
//    WebElement OrderCutoffTime = driver.findElement(By.id(xPathLocators.OrderCutoffTime));
//    Select OrderCutoffTime1 = new Select(OrderCutoffTime);
//    OrderCutoffTime1.selectByIndex(12);
//    
//    WebElement CopyCostFileFrom = driver.findElement(By.id(xPathLocators.CopyCostFileFrom));
//    Select CopyCostFileFrom1 = new Select(CopyCostFileFrom);
//    CopyCostFileFrom1.selectByIndex(1);
//    
//    WebElement PriceFileWritePath = driver.findElement(By.id(xPathLocators.PriceWritePath));
//    Select PriceFileWritePath1 = new Select(PriceFileWritePath);
//    PriceFileWritePath1.selectByIndex(1);
//    
//    WebElement DataTransportProtocol = driver.findElement(By.id(xPathLocators.DataTransportProtocol));
//    Select DataTransportProtocol1 = new Select(DataTransportProtocol);
//    DataTransportProtocol1.selectByIndex(1);
//    
//    WebElement EDIPricingFormat = driver.findElement(By.id(xPathLocators.EdiPricingFormat));
//    Select EDIPricingFormat1 = new Select(EDIPricingFormat);
//    EDIPricingFormat1.selectByIndex(1);
//    
//    WebElement ExternalExport = driver.findElement(By.id(xPathLocators.ExportFtpId));
//    Select ExternalExport1 = new Select(ExternalExport);
//    ExternalExport1.selectByIndex(1);
//    
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.AnId))).sendKeys(addDistributor_TestData.BlueBookScore);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.TransportAddress))).sendKeys(addDistributor_TestData.TransportAddress);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.TransportId))).sendKeys(addDistributor_TestData.DataTransportID);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.TransportPassword))).sendKeys(addDistributor_TestData.DataTransportPassword);
//    
//    WebElement EDIInterchangeQualifier = driver.findElement(By.id(xPathLocators.EdiInterchangeQualifier));
//    Select EDIInterchangeQualifier1 = new Select(EDIInterchangeQualifier);
//    EDIInterchangeQualifier1.selectByIndex(1);
//
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.EdiInterchangeId))).sendKeys(addDistributor_TestData.EDIInterchangeID);

//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.NextInStep5))).click();
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.BlueBookScore))).sendKeys(addDistributor_TestData.BlueBookScore);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.BlueBookScoreRating))).sendKeys(addDistributor_TestData.Rating);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.FcScore))).sendKeys(addDistributor_TestData.FCScore);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.BlueBookScoreExplanation))).sendKeys(addDistributor_TestData.Explanation);
//    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.FcScoreExplanation))).sendKeys(addDistributor_TestData.Explanation2);
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Submit))).isEnabled();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocators.Submit))).click();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            webDriverManager.quitDriver();
	        }
	       
}
	 public static void main(String[] args) {
     	distributor_Creation();
     }
	 public static void clickWithRetry(By locator) {
		 WebDriver driver = webDriverManager.getDriver();
		    int attempts = 0;
		    while (attempts < 5) {
		        try {
		            WebElement element = driver.findElement(locator);
		            element.click();
		            break;
		        } catch (ElementClickInterceptedException e) {
		            System.out.println("Attempt " + (attempts + 1) + ": Click intercepted, retrying...");
		        }
		        attempts++;
		    }
		}
	}

