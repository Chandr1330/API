package StepDefination;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment7 {
	Response response;
	RequestSpecification httpRequest;
	@Given("Provide URI")
	public void provide_uri() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI = "https://www.reqres.in/";
		
	}

	@When("Enter email but not enter password")
	public void enter_email_but_not_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		JSONObject j = new JSONObject();
		j.put("email", "sydney@fife");
		httpRequest = given().header("content-type","application/json").body(j.toJSONString());
		response = httpRequest.post("/api/register");
		
		
	}

	@Then("Validate Response")
	public void validate_response() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(response.getStatusCode(), 404);
		System.out.println(response.getStatusCode());
	}

}
