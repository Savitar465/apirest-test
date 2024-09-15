package reqres.users.methods;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import reqres.general.ReqresAPIBase;
import reqres.users.UserQuestions;
import reqres.users.request.GetUserRequest;

public class GetUserNotFoundTest extends ReqresAPIBase {

    @Test
    public void getUsersTest() {
        Response response = GetUserRequest.getUserRequest(requestSpecification, "23");
        UserQuestions.validateStatusCode(response, 404);
    }
}
