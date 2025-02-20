package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    void CreateUser(User user);

    User deleteUser(String userId);

    void updateUser(String userID, User updatedUser);

    User findUserById(List<User> users, String userId);
}