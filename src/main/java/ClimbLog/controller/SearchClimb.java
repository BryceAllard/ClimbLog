package ClimbLog.controller;

import ClimbLog.entity.Climb;
import ClimbLog.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * A servlet to search climbs by difficulty and location.
 */
@WebServlet(
        urlPatterns = {"/searchClimb"}
)
public class SearchClimb extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<Climb> climbDao = new GenericDao<>(Climb.class);

        // Get the search parameters
        String difficulty = req.getParameter("difficulty");
        String location = req.getParameter("location");

        // Search climbs by difficulty and/or location
        List<Climb> climbs;
        // Can look at this part later
//        if (difficulty != null && location != null) {
//            climbs = climbDao.getByTwoProperties("difficulty", Integer.parseInt(difficulty), "location", location);
//        } else
            if (difficulty != null) {
            climbs = climbDao.getByPropertyEqual("difficulty", difficulty);
        } else if (location != null) {
            climbs = climbDao.getByPropertyEqual("location", location);
        } else {
            climbs = climbDao.getAll();
        }

        // Set climbs as an attribute in the request
        req.setAttribute("climbs", climbs);

        // Forward the request to results.jsp for displaying the climbs
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}
