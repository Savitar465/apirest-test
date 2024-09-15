package reqres.users.request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUserRequest {
    public static Response getUserRequest(RequestSpecification requestSpecification, String userId){
        return requestSpecification.get("/api/users/" + userId);
    }
}
