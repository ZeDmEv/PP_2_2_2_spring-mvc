package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User updatedUser);
    User getById(long id);
}
