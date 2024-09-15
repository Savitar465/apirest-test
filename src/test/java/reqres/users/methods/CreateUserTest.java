package reqres.users.methods;

import io.restassured.response.Response;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import reqres.general.ReqresAPIBase;
import reqres.users.UserModel;
import reqres.users.UserQuestions;
import reqres.users.request.CreateUserRequest;

public class CreateUserTest extends ReqresAPIBase {

    @ParameterizedTest
    @CsvSource({
            "morpheus, leader",
            "eve, engineer",
            "charles, developer"
    })
    public void createUserTest(String name, String job) {
        String payload = UserModel.userPayload(name, job);
        Response response = CreateUserRequest.postCreateUser(requestSpecification, payload);
        UserQuestions.validateStatusCode(response, 201);
        UserQuestions.validateJsonSchema(response, "reqres/UserCreatedJsonSchema.json");
    }

}
