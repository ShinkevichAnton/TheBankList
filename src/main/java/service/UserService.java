package service;

import dao.UserDAO;
import model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
