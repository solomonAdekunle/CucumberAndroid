package Base;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepsDefinition extends WebConnector {
	
	
	
	
	
	
	public StepsDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}














	@Given("^I Navigate to the homepage on \"([^\"]*)\"$")
	public void i_Navigate_to_the_homepage_on(String arg1) throws MalformedURLException  {
		
	    
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

}
