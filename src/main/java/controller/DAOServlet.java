package controller;

import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dao.jsp")
public class DAOServlet extends HttpServlet {

    private User user;
    private List<User> userList;

    public DAOServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        userList = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");


            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root",
                    "1111");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select user.*,account.* from user,account where user.userid = account.userid;");
            out.println("<table border=\"1\">");
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setAccountId(resultSet.getLong("accountId"));
                user.setAccount(resultSet.getInt("account"));
                user.setUserId(resultSet.getLong("userid"));
                userList.add(user);
                out.println("<tr>");
                out.println("<td>" + resultSet.getLong("userid") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getString("surname") + "</td>");
                out.println("<td>" + resultSet.getLong("accountId") + "</td>");
                out.println("<td>" + resultSet.getInt("account") + "</td>");
                out.println("<td>" + resultSet.getLong("userid") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (out != null)
                out.close();
        }
    }
}

