package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class ChangePasswordPage extends BasePage {

	
	
		/* Initialize the Webdriver */
	public ChangePasswordPage(WebDriver d) {
		super(d);
		
	}
    /* Verify if Change Password Title Page is diplayed on Change Password Page */
	public boolean isChangePasswordTitlePageDisplay() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PageTitle)));
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();

	}

	/* Verify if old Password input box is displayed on Change Password Page */
	public boolean isChangePasswordOldPasswordInputboxPresent() {
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_OldPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).isDisplayed();
		

	}
   /* Verify if  New Password Input box is displayed on Change Password Page */
	public boolean isChangePasswordNewPasswordInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_NewPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).isDisplayed();

	}
	/* Verify if  Confirmed Password Input box is displayed on Change Password Page */
	public boolean isChangePasswordConfirmPasswordInputBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ConfirmPassword)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_ConfirmPassword)).isDisplayed();

	}
	/* Verify if Submit Button is displayed on Change Password Page */
	public boolean isChangePasswordSubmitButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_Submit)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_Submit)).isDisplayed();

	}
	/* Verify if Error Message is displayed on Change Password Page */
	public boolean isChangePassWordErrorMessagePresent(){
		WebDriverWait wait = new WebDriverWait(d,35);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ErrorMessage)));
		return d.findElement(By.cssSelector(Constant.ChangePassword_ErrorMessage)).isDisplayed();
	 		
	}
	/* Verify if my Password word has ben successful change */
	 public boolean isPassWordSuccessfullyChangeTitlePagePresent(){
		 WebDriverWait wait = new WebDriverWait(d,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PasswordChangeSuccessfully)));
			return d.findElement(By.cssSelector(Constant.PasswordChangeSuccessfully)).isDisplayed();
		 
	 }
       /* Enter your Old Password  on change Password page*/
	public void sendChangePasswordOldPassword(String oldpassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_OldPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_OldPassword)).sendKeys(oldpassword);

	}
		/* Enter a new Password in the Input box */
	public void sendChangePasswordNewPassword(String newpassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_NewPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_NewPassword)).sendKeys(newpassword);

	}
    /* Enter your confirmed password on the Change Password Page */
	public void sendChangePasswordConfirmPassword(String confirmPassword) {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_ConfirmPassword)));
		d.findElement(By.cssSelector(Constant.ChangePassword_ConfirmPassword)).sendKeys(confirmPassword);

	}
		/* Click Change Password Submit button */
	public void clickChangePasswordSubmitButton(){
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.ChangePassword_Submit)));
		d.findElement(By.cssSelector(Constant.ChangePassword_Submit)).click();
		
	}
}
