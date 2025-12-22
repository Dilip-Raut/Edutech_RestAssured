package stepdefinitions;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import utils.DataProviderUtil;
import static io.restassured.RestAssured.given;

public class FacultySteps {

    @Given("faculty payload from {string}")
    public void facultyPayload(String key) {

        JSONObject data = DataProviderUtil.getData(key);

        CommonSteps.request = given()
                .contentType(ContentType.JSON)
                .body(data);
    }
}
