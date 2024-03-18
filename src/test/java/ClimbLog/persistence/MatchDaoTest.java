package ClimbLog.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchDaoTest {

    @Test
    void getMatchSuccess() {
        MatchDao dao = new MatchDao();
        assertEquals(1, dao.getMatch().getId());
    }
}