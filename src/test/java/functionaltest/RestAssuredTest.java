package functionaltest;

import io.restassured.RestAssured;
import org.junit.Before;

public abstract class RestAssuredTest {

    private static String BASE_URL = "http://localhost:8080/";

    @Before
    public void intitialize() {
        RestAssured.baseURI = BASE_URL;
    }
}
