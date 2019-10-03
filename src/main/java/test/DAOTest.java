package test;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DAOTest {
    private User user;
    private UserDAO userDAO = new UserDAOImpl();

    @Before
    public void init() {
        user = new User();
        user.setId(1L);
        user.setName("Steven");
        user.setSurname("Bush");
        user.setAccountId(1L);
        user.setAccount(111);
    }

    @Test
    public void testGetAll() {
        List<User> actual = userDAO.getAll();
        assertNotNull(actual);
        assertTrue(!actual.isEmpty());

    }

}
