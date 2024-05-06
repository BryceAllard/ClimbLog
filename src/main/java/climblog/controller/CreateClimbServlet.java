package climblog.controller;

import climblog.entity.Climb;
import climblog.entity.User;
import climblog.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/createClimb")
public class CreateClimbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to JSP for displaying the form
        RequestDispatcher dispatcher = request.getRequestDispatcher("/createClimb.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String name = request.getParameter("name");
        String state = request.getParameter("state");
        int difficulty = Integer.parseInt(request.getParameter("difficulty"));
        String type = request.getParameter("type");
        int userId = Integer.parseInt(request.getParameter("userId"));

        // Create a new climb object
        Climb climb = new Climb();
        climb.setName(name);
        climb.setState(state);
        climb.setDifficulty(difficulty);
        climb.setType(type);

        // Retrieve user from the database using userId
        GenericDao<User> userDao = new GenericDao<>(User.class);
        User user = userDao.getById(userId);
        climb.setUser(user);

        // Save the climb object to the database
        GenericDao<Climb> climbDao = new GenericDao<>(Climb.class);
        int climbId = climbDao.insert(climb);

        // Redirect to a success page or display a success message
        response.sendRedirect(request.getContextPath() + "/climbCreated.jsp?id=" + climbId);
    }
}
