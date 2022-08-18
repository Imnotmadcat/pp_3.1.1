package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);

    User getById(long id);

    void update(User user);

    void delete(long id);
}
