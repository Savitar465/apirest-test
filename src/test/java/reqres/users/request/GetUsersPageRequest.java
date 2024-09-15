package reqres.users.request;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUsersPageRequest {
    public static Response getUsersRequest(RequestSpecification requestSpecification, String page) {
        requestSpecification.param("page", page);
        return requestSpecification.get("/api/users");
    }
}
