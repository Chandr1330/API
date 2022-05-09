package StepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment3 {
	Response response;
	RequestSpecification httpRequest;

	@Given("URI")
	public void uri() {
		RestAssured.baseURI = "https://reqres.in/";
	}

	@When("Giving EndPoints")
	public void giving_end_points() {
	   response = RestAssured.get("/api/users/2");
	}

	@Then("Validate TWO Response Code")
	public void validate_two_response_code() {
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(response.getContentType(),"application/json; charset=utf-8");
	}

}
