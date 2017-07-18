package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class SlotsGamePage  extends BasePage{

	public SlotsGamePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isSlotsGameMenuWithinGameSessionPagePressent(){
		WebDriverWait wait = new WebDriverWait(d,120);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SlotsGameMenuIcon)));
	return	d.findElement(By.cssSelector(Constant.SlotsGameMenuIcon)).isDisplayed();
	}
	 public void NavigateBackToHomePage(){
		 d.navigate().back();
	 }
	 
	 
	public boolean isVegasSlotGameSoundsBoxPresent(){
		WebDriverWait wait = new WebDriverWait(d,90);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(Constant.SlotGamesSoundPopUpBox)));
		return	d.findElement(By.xpath(Constant.SlotGamesSoundPopUpBox)).isDisplayed();
	}
	
	public boolean isGameLoading(){
		WebDriverWait wait = new WebDriverWait(d,70);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.SlotGamesLoading)));
		return	d.findElement(By.cssSelector(Constant.SlotGamesLoading)).isDisplayed();
	}
		
	}

