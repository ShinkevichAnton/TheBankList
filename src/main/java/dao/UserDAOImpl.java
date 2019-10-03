package dao;

import model.User;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDAOImpl implements UserDAO {

    Properties properties = new Properties();

    private final static String GET_ALL_SQL = "select user.*,account.* from user,account where user.userid = account.userid;";

    private static final InputStream PATH =
            UserDAO.class.getResourceAsStream("database.properties");

    public UserDAOImpl() {
        try {
            properties.load(PATH);
            Class.forName(properties.getProperty("driver"));
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }





    @Override
    public List<User> getAll() {
        List<User> products = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(properties.getProperty("url"),
                properties.getProperty("username"), properties.getProperty("password"));
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(GET_ALL_SQL)) {
            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setAccountId(resultSet.getLong("accountId"));
                user.setAccount(resultSet.getInt("account"));
                user.setUserId(resultSet.getLong("userId"));
                products.add(user);
            }
            return products;
        } catch (SQLException e) {
            e.printStackTrace();
            return products;
        }
    }


}
