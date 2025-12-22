package stepdefinitions;


import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import utils.DataProviderUtil;
import static io.restassured.RestAssured.given;

public class StudentSteps {

    @Given("student payload from {string}")
    public void studentPayload(String key) {

        JSONObject data = DataProviderUtil.getData(key);

        CommonSteps.request = given()
                .contentType(ContentType.JSON)
                .body(data);
    }
}
