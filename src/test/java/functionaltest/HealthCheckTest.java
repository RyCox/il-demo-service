package functionaltest;

import com.rycox.ildemo.domain.HealthResponse;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class HealthCheckTest extends RestAssuredTest {

    @Test
    public void testHealthCheckOK() {
        Response healthResponse = given().get("/health");
        Assert.assertEquals(200, healthResponse.getStatusCode());

        HealthResponse responseObj = healthResponse.as(HealthResponse.class);
        Assert.assertEquals("OK", responseObj.getStatus());
    }

    @Test
    public void testHealthCheckReturnsParam() {
        Response healthResponse = given().queryParam("status", "FAILED")
                .get("/health");
        Assert.assertEquals(200, healthResponse.getStatusCode());

        HealthResponse responseObj = healthResponse.as(HealthResponse.class);
        Assert.assertEquals("FAILED", responseObj.getStatus());
    }
}
