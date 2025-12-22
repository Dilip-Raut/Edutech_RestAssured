package base;

import org.testng.annotations.BeforeClass;

import config.ConfigReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.get("baseUrl");
        RestAssured.filters(new AllureRestAssured());
    }
}
