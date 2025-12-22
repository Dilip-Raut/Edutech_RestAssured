package stepdefinitions;

import base.BaseTest;
import constants.Endpoints;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class CommonSteps extends BaseTest {

    public static Response response;
    public static RequestSpecification request;

    @When("user calls {string} api using {string}")
    public void callApi(String apiName, String method) {

        String endpoint = Endpoints.getPath(apiName);

        if (method.equalsIgnoreCase("POST"))
            response = request.when().post(endpoint);
        else if (method.equalsIgnoreCase("GET"))
            response = request.when().get(endpoint);
    }

    @Then("response status should be {int}")
    public void verifyStatus(int code) {
        response.then().statusCode(code);
    }

    @And("response schema should be {string}")
    public void validateSchema(String schema) {
        response.then().body(
                matchesJsonSchemaInClasspath("schemas/" + schema));
    }
}
