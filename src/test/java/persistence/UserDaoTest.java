package persistence;

import ClimbLog.entity.Climb;
import ClimbLog.entity.User;
import ClimbLog.persistence.GenericDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Database;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    //UserDao userDao;
    GenericDao genericDao;

    @BeforeEach
    void setUp() {
        genericDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL("cleanDB.sql");
    }

    @Test
    void getByIdSuccess() {
        //userDao = new UserDao();

        //User retrievedUser = userDao.getById(1);
        User retrievedUser = (User) genericDao.getById(1);
        assertTrue(retrievedUser != null);
        assertEquals("Joe", retrievedUser.getFirstName());
    }


    @Test
    void update() {
        //serDao = new UserDao();
        //User userToUpdate = userDao.getById(1);
        User userToUpdate = (User) genericDao.getById(1);
        userToUpdate.setLastName("Newbold");
        genericDao.update(userToUpdate);

        // retrieve the user and check that the name change worked
        User actualUser = (User)genericDao.getById(1);
        assertEquals("Newbold", actualUser.getLastName());
    }

    @Test
    void delete() {
        //userDao = new UserDao();
        genericDao.delete(genericDao.getById(2));
        assertNull(genericDao.getById(2));
    }

    @Test
    void insertSuccess() {
        //userDao = new UserDao();
        User newUser = new User("Duncanyo", "Idahoso", "Udahoes10");
        int insertedUserId = genericDao.insert(newUser);
        assertNotEquals(0, insertedUserId);
        User insertedUser = (User) genericDao.getById(insertedUserId);
        assertEquals("Duncanyo", insertedUser.getFirstName());
    }

    @Test
    void getAll() {

        List<User> users = genericDao.getAll();
        assertEquals(6, users.size());
    }

    @Test
    void getByPropertyEqual() {

        List<User> users = genericDao.getByPropertyLike("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    @Test
    void getByPropertyLike() {

        List<User> users = genericDao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }

}



/*





@Test
    void getByPropertyLike() {

        List<User> users = genericDao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }

*/