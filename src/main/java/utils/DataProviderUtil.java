package utils;


import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.InputStream;

public class DataProviderUtil {

    private static final String TEST_DATA_PATH =
            "src/test/resources/testdata/testdata.json";

    public static JSONObject getData(String key) {

        try {
            InputStream inputStream = new FileInputStream(TEST_DATA_PATH);
            JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));

            if (!jsonObject.has(key)) {
                throw new RuntimeException("Key not found in test data: " + key);
            }

            return jsonObject.getJSONObject(key);

        } catch (Exception e) {
            throw new RuntimeException("Failed to read test data file", e);
        }
    }
}
