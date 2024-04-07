package persistence;

import climblog.entity.Climb;
import climblog.persistence.GenericDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClimbDaoTest {

    GenericDao<Climb> genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao<>(Climb.class);
        Database database = Database.getInstance();
        database.runSQL("cleanDB.sql");
    }

    @Test
    void getByIdSuccess() {
        Climb retrievedClimb = genericDao.getById(1);
        assertNotNull(retrievedClimb);
        assertEquals("Rain Acid", retrievedClimb.getName());
    }

    @Test
    void update() {
        Climb climbToUpdate = genericDao.getById(1);
        climbToUpdate.setName("Rain Acid Alt");
        genericDao.update(climbToUpdate);

        Climb updatedClimb = genericDao.getById(1);
        assertEquals("Rain Acid Alt", updatedClimb.getName());
    }

    @Test
    void delete() {
        genericDao.delete(genericDao.getById(2));
        assertNull(genericDao.getById(2));
    }

    @Test
    void insertSuccess() {
        Climb newClimb = new Climb("Big Bud", null);
        int insertedClimbId = genericDao.insert(newClimb);
        assertNotEquals(0, insertedClimbId);
        Climb insertedClimb = genericDao.getById(insertedClimbId);
        assertEquals("Big Bud", insertedClimb.getName());
    }

    @Test
    void getAll() {
        List<Climb> climbs = genericDao.getAll();
        assertEquals(4, climbs.size());
    }

    @Test
    void getByPropertyEqual() {
        List<Climb> climbs = genericDao.getByPropertyEqual("name", "Rain Acid");
        assertEquals(1, climbs.size());
        assertEquals(1, climbs.get(0).getId());
    }

    @Test
    void getByPropertyLike() {
        List<Climb> climbs = genericDao.getByPropertyLike("name", "id");
        assertEquals(2, climbs.size());
    }
}
