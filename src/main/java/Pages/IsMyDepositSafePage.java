package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class IsMyDepositSafePage extends BasePage {

	public IsMyDepositSafePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isIsMyDepositSafeTitlePageDisplay(){
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.PageTitle)));
		return d.findElement(By.cssSelector(Constant.PageTitle)).isDisplayed();
		
	}
	

}
