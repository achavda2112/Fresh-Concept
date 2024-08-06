package FC_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_baseClass {

    public void login() {
        WebDriver driver = webDriverManager.getDriver();
        driver.get("https://staging1.freshconcepts.info");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys(login_TestData.USERNAME);
        driver.findElement(By.id("password")).sendKeys(login_TestData.PASSWORD);
        driver.findElement(By.id("login")).click();
    }
    public static void main(String[] args) {
        // Create an instance of the login class and perform login
        Login_baseClass loginPage = new Login_baseClass();
        loginPage.login();
    }
}
