package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    User getById(long id);

    void update(User user);

    void delete(long id);
}
