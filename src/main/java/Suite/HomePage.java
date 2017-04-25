package Suite;

import java.net.MalformedURLException;

import Base.WebConnector;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage {
	
	WebConnector selenium = WebConnector.getInstance();
	@Before
	public void initialised() throws MalformedURLException{
		//selenium.SetPath();
	}
	
	@Given("^I Navigate to the homepage$")
	public void i_Navigate_to_the_homepage() throws MalformedURLException {
		selenium.navigate();
		
		//d.get(Config.getProperty("URL"));
		
		
	    
	}
	
	@Then("^I should see Login Button$")
	public void i_should_see_Login_Button()  {
	   
	}

	@Then("^I should see Supercasino Logo$")
	public void i_should_see_Supercasino_Logo()  {
	   
	}

	@Then("^I should see SideBar Menu Icon$")
	public void i_should_see_SideBar_Menu_Icon()  {
	    
	}

	@Then("^I should see Casino Vertical Tab$")
	public void i_should_see_Casino_Vertical_Tab()  {
	}

	@Then("^I should see Vegas Vertical Tab$")
	public void i_should_see_Vegas_Vertical_Tab()  {
	   
	}

	@Then("^I should see Live Vertical Tab$")
	public void i_should_see_Live_Vertical_Tab()  {
	   
	}

	@Then("^I should see Promos Vertical Tab$")
	public void i_should_see_Promos_Vertical_Tab()  {
	}

	@Then("^I should see Hero Banner$")
	public void i_should_see_Hero_Banner()  {
	   
	}

	@Then("^I should see  Games Category Tab$")
	public void i_should_see_Games_Category_Tab()  {
	   
	}

	
	
	@After()
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
	    selenium.quit();
	}

	

}
