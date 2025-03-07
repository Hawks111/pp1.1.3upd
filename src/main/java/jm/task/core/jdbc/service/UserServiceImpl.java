package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    public final UserDao userDao;

    public UserServiceImpl() { this.userDao = new UserDaoJDBCImpl(); }

    public void createUsersTable() { userDao.createUsersTable(); }

    public void dropUsersTable() { userDao.dropUsersTable(); }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.println("User с именем — " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        System.out.println("Пользователь с id " + id + " удалён");
    }

    public List<User> getAllUsers() { return userDao.getAllUsers(); }

    public void cleanUsersTable() { userDao.cleanUsersTable(); }

}