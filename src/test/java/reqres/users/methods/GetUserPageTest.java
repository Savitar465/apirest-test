package reqres.users.methods;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import reqres.general.ReqresAPIBase;
import reqres.users.UserQuestions;
import reqres.users.request.GetUsersPageRequest;

public class GetUserPageTest extends ReqresAPIBase {

    @Test
    public void getUsersTest() {
        Response response = GetUsersPageRequest.getUsersRequest(requestSpecification, "2");
        UserQuestions.validateStatusCode(response, 200);
        UserQuestions.validateJsonSchema(response, "reqres/PageUserJsonSchema.json");
    }
}
