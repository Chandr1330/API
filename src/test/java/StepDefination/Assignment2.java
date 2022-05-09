package StepDefination;

import org.json.simple.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assignment2 {
	Response response;
	RequestSpecification request;
	@Given("URI, Body and content type")
	public void uri_body_and_content_type() {
		JSONObject p = new JSONObject();
		p.put("name", "Chandr");
		p.put("job", "Test Engineer");
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		request = given().log().all().header("content-type","application/json").
		body(p.toJSONString());
		
	}

	@When("Provide EndPoint")
	public void provide_end_point() {
		response = request.post("api/users").then().log().all().extract().response();
	    
	}

	@Then("Validate the Response Code & Logging in Console")
	public void validate_the_response_code_logging_in_console() {
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(),201);
	    
	}

}
