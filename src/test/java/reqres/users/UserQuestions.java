package reqres.users;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserQuestions {

    public static void validateStatusCode(Response response, Integer statusCodeExpected){
        assertEquals(
                "Validacion del Status Code",
                String.valueOf(statusCodeExpected),
                String.valueOf(response.statusCode())
        );
    }

    public static void validateUrl(Response response, String expectedUrl){
        JsonPath jsonPath = new JsonPath(response.body().asString());
        assertEquals(
                expectedUrl,
                jsonPath.getString("url"),
                "Validacion de la url"
        );
    }

    public static void validateErrorMessage (Response response, String expectedError){
        JsonPath jsonPath = new JsonPath(response.body().asString());
        assertEquals(
                expectedError,
                jsonPath.getString("msg"),
                "Validacion del mensaje de error"
        );
    }

    public static void validateJsonSchema(Response response,String schema){
        // El codigo que me va a permitir realizar la validacion del
        // Response Vs JsonSchema

        JsonSchemaValidator jsv =
                JsonSchemaValidator.matchesJsonSchemaInClasspath(schema);

        assertTrue(
                "Validacion del Json Schema para APOD Questions",
                jsv.matches(response.asString())
        );
    }
}
