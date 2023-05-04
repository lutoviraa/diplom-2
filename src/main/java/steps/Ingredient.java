package steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.example.config.Config.INGREDIENTS_PATH;
import static org.example.config.Config.baseRqSpec;

public class Ingredient {
    @Step("Получение данных об ингредиентах")
    public Response getIngredient() {
        return given()
                .spec(baseRqSpec)
                .get(INGREDIENTS_PATH);
    }
}
