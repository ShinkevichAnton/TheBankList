package service;

import dao.UserDAO;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public List<User> getAll() {

        return userDAO.getAll();
    }


}
