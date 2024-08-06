package FC_Automation.user_Management;

import org.openqa.selenium.WebDriver;

import FC_Automation.Login_baseClass;
import FC_Automation.webDriverManager;

public class user_management extends Login_baseClass {

	public static void usermanagement() {
		WebDriver driver = webDriverManager.getDriver();
		if (driver == null) {
			System.out.println("Driver initialization failed.");
			return;
		}
		try {
			// Perform login
			Login_baseClass login_baseClass = new Login_baseClass();
			login_baseClass.login();
			
			//Perform Add and Delete Users
			CRUD_Funcationality userFunc = new CRUD_Funcationality();
			userFunc.addNEwUser();
			userFunc.editUser();
			userFunc.deleteUser();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			webDriverManager.quitDriver();
		}
	}

	public static void main(String[] args) {
		usermanagement();
	}
}
