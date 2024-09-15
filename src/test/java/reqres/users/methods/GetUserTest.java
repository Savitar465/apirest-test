package reqres.users.methods;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import reqres.general.ReqresAPIBase;
import reqres.users.UserQuestions;
import reqres.users.request.GetUserRequest;

public class GetUserTest extends ReqresAPIBase {

    @Test
    public void getUserTest() {
        Response response = GetUserRequest.getUserRequest(requestSpecification, "12");
        UserQuestions.validateStatusCode(response, 200);
        UserQuestions.validateJsonSchema(response, "reqres/UserJsonSchema.json");
    }
}
