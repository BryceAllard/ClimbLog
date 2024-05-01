package climblog.controller;

import climblog.com.climr.Match;
import climblog.persistence.MatchDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MatchServlet", value = "/match")
public class MatchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MatchDao matchDao = new MatchDao();
        List<Match> matches = matchDao.getMatches(5); // Get 5 matches
        request.setAttribute("matches", matches);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/match.jsp");
        dispatcher.forward(request, response);
    }


}
