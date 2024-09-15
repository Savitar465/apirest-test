package reqres.users;

public class UserModel {

    public static String userPayload(String name, String job){

        return "{"
               + "\"name\":\"" + name + "\","
               + "\"job\":\"" + job + "\""
               + "}";
    }

}
