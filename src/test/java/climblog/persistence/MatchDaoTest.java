package climblog.persistence;

import climblog.com.climr.Match;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatchDaoTest {

    @Test
    void getMatchSuccess() {
        MatchDao dao = new MatchDao();
        List<Match> matches = dao.getMatches();
        // Assuming you want to assert against the first match in the list
        assertEquals(1, matches.get(0).getId());
    }

}