package reqres.users.request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUserDelayedRequest {
    public static Response getUserDelayedRequest(RequestSpecification requestSpecification, String delay) {
        requestSpecification.param("delay", delay);
        return requestSpecification.get("/api/users");
    }
}
