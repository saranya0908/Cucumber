package stepdefinition;

import io.cucumber.java.en.*;

public class steps {

	@Given("I have a browser opened with IXL website")
	public void i_have_a_browser_opened_with_ixl_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("1");
	}
	@When("I enter correct user id and password")
	public void i_enter_correct_user_id_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("2");
	}
	@When("click on submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("3");
	}
	@Then("I should be able to navigate to home page")
	public void i_should_be_able_to_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("4");
	}

	
}
