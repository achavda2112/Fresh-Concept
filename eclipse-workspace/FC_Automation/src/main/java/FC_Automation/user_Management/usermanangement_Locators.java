package FC_Automation.user_Management;

public class usermanangement_Locators {
	
	 public static final String AdminMenu = "//*[@id='Admin']";
	 public static final String Users = "//*[@id='Admin01']";
	 public static final String AddUsers = "//*[@id='Users01']";
	 public static final String ManageUsers = "//*[@id='Users02']";
	 public static final String SearchUsers = "//*[@field='USERNAME']//input";
	 public static final String ClickOnUser = "//a[contains(text(),'AChavdaa')]";
	 public static final String FisrtName = "//*[@id='first']";
	 public static final String LastName = "//*	[@id='last']";
	 public static final String Username = "//*[@id='username']";
	 public static final String Password = "//*[@id='password']";
	 public static final String ConfirmPassword = "//*[@id='confirmPassword']";
	 public static final String MasterUserCheckBox = "//*[@id='masterUser']";
	 public static final String AccessLevel = "//*[@id='access']";
	 public static final String StartDate = "//input[@name='configValue']";
	 public static final String Email = "//*[@id='email']";
	 public static final String Phone = "//*[@id='phone']";
	 public static final String IsActive = "//*[@id='isActive']";
	 public static final String Save = "(//button[@class='btn green submit'])[1]";
	 public static final String SaveAndContinue = "(//button[normalize-space()='Save and Continue'])[1]";
	 public static final String DeleteUser = "//*[@id='deleteUser']";
	 public static final String ConfirmSubmit = "(//button[normalize-space()='Submit'])";
	 public static final String UserCreationToast = "//div[contains(text(),'User saved successfully!!')]";
	 public static final String DeleteUserConfirmation = "//div[contains(text(),'User deleted successfully!!')]";
	
}
