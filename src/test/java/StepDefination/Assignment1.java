package StepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assignment1 {
	Response response;
	@Given("URI and Endpoints")
	public void uri_and_endpoints() {
		RestAssured.baseURI = "https://reqres.in/api";
	}

	@When("Provideing Endpoints")
	public void provideing_endpoints() {
		response = RestAssured.get("users?page=2");
		System.out.println(response.getContentType());
	}

	@Then("Validating the Response Code")
	public void validating_the_response_code() {
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
