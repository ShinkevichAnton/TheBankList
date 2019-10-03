package controller;

import dao.UserDAOImpl;
import model.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ForJSPServlet extends HttpServlet {

    // не успел реализовать Servlet для добавления в jsp(так же не успел дописать методы в сервис и бд)

    /*private UserService userService;

    public ForJSPServlet() {
        userService = new UserServiceImpl(new UserDAOImpl());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        RequestDispatcher dispatcher;
        Long id;
        List<User> userList;
        switch (action) {
            case "richesUser":
                userList =userService.getSummAccount();
                request.setAttribute("user", userList);
                dispatcher = request.getRequestDispatcher("sumAccount.jsp");
                dispatcher.forward(request, response);
                break;
            case "getRichet":
                userList =userService.getRichest();
                request.setAttribute("user", userList);
                dispatcher = request.getRequestDispatcher("richest.jsp");
                dispatcher.forward(request, response);
                break;
        }
    }*/
}

