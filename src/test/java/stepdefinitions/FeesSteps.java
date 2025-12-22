package stepdefinitions;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import utils.DataProviderUtil;
import static io.restassured.RestAssured.given;

public class FeesSteps {

    @Given("fees payload from {string}")
    public void feesPayload(String key) {

        JSONObject data = DataProviderUtil.getData(key);

        CommonSteps.request = given()
                .contentType(ContentType.JSON)
                .body(data);
    }
}
