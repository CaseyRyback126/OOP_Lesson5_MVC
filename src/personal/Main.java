package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/personal/users.txt");
        JsonOperation jsonOperation = new JsonOperation("src/main/java/personal/users.json");
        Repository repository = new RepositoryFile(fileOperation, jsonOperation, new UserMapper(), new JsonMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}