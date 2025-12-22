package stepdefinitions;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class LoginSteps {

    @Given("login payload with {string} and {string}")
    public void loginPayload(String email, String password) {

        CommonSteps.request = given()
                .contentType(ContentType.JSON)
                .body(Map.of(
                        "email", email,
                        "password", password
                ));
    }
}
