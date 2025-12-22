package utils;



import io.restassured.response.Response;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaValidatorUtil {

    private static final String SCHEMA_PATH = "schemas/";

    public static void validateSchema(Response response, String schemaFileName) {

        response.then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath(SCHEMA_PATH + schemaFileName));
    }
}
