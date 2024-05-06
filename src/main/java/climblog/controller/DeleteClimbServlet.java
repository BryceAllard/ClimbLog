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

@WebServlet("/deleteClimb")
public class DeleteClimbServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward to JSP for displaying the form
        RequestDispatcher dispatcher = request.getRequestDispatcher("/deleteClimb.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve climb ID from the form
        int climbId = Integer.parseInt(request.getParameter("id"));

        // Initialize the GenericDao for Climb entity
        GenericDao<Climb> climbDao = new GenericDao<>(Climb.class);

        // Get the Climb entity by ID
        Climb climb = climbDao.getById(climbId);

        // Delete the climb entity
        climbDao.delete(climb);

        // Redirect to a success page or display a success message
        response.sendRedirect(request.getContextPath() + "/climbDeleted.jsp");
    }
}
