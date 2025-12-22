package stepdefinitions;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class RegistrationSteps {

    @Given("registration payload with {string} {string} {string}")
    public void registrationPayload(String name, String email, String password) {

        CommonSteps.request = given()
                .contentType(ContentType.JSON)
                .body(Map.of(
                        "name", name,
                        "email", email,
                        "password", password
                ));
    }
}
