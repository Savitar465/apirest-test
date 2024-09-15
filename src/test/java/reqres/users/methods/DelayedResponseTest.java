package reqres.users.methods;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import reqres.general.ReqresAPIBase;
import reqres.users.UserQuestions;
import reqres.users.request.GetUserDelayedRequest;

public class DelayedResponseTest extends ReqresAPIBase {

    @Test
    public void delayedResponseTest() {
        Response response = GetUserDelayedRequest.getUserDelayedRequest(requestSpecification, "3");
        UserQuestions.validateStatusCode(response, 200);
        UserQuestions.validateJsonSchema(response, "reqres/PageUserJsonSchema.json");
    }
}
