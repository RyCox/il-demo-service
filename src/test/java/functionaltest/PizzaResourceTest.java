package functionaltest;

import com.rycox.ildemo.domain.Pizza;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PizzaResourceTest extends RestAssuredTest {

    @Test
    public void testGetPizza() {
        Response pizzaResponse = given().get("/pizza");
        Assert.assertEquals(200, pizzaResponse.getStatusCode());

        Pizza pizzaObject = pizzaResponse.as(Pizza.class);
        Assert.assertTrue(pizzaObject.getIngredientList().contains("Cheese"));
        Assert.assertTrue(pizzaObject.getIngredientList().contains("Sauce"));
        Assert.assertTrue(pizzaObject.getIngredientList().contains("Dough"));
        Assert.assertTrue(pizzaObject.getIngredientList().contains("Pepperoni"));
    }

    @Test
    public void testCreatePizza() {

    }

    @Test
    public void testBadRequestWhenNoCheese() {

    }
}
