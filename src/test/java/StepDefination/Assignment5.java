package StepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
	

	public class Assignment5 {
		Response response;
		@Given("API for foreign exchange one for assertion")
	public void api_for_foreign_exchange_one_for_assertion() {
		RestAssured.baseURI = "https://reqres.in";
}

	@When("posted with incorrect Information for assertion")
	public void posted_with_incorrect_information_for_assertion() {
		response = RestAssured.get("/api/users/23");
}

	@Then("validate negative response code received for assertion")
	public void validate_negative_response_code_received_for_assertion() {
		System.out.println(response.getStatusLine());
		Assert.assertEquals(404,response.getStatusCode());
}

}
