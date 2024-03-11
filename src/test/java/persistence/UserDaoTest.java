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
}
/*
    @Test
    void update() {
        userDao = new UserDao();
        User userToUpdate = userDao.getById(1);
        userToUpdate.setLastName("Newbold");
        userDao.update(userToUpdate);

        // retrieve the user and check that the name change worked
        User actualUser = userDao.getById(1);
        assertEquals("Newbold", actualUser.getLastName());
    }

    @Test
    void insertSuccess() {
        userDao = new UserDao();
        User userToInsert = new User();

        userToInsert.setFirstName("Trippys");
        userToInsert.setLastName("Reddo");
        userToInsert.setUserName("Tredd5");
        // Don't do ID bc it's autoInt - userToInsert.setId(117);

        assertTrue(userToInsert.getFirstName() != null);
        //assertEquals(117, userToInsert.getId());
        // Can use the constructor to do this automatically! 15:10
        // in week 4 video 2 of the DAO series
        // how it was done in the demo
        userDao = new UserDao();
        User newUser = new User("Duncanyo", "Idahoso", "Udahoes10");
        int insertedUserId = userDao.insert(newUser);
        assertNotEquals(0, insertedUserId);
        User insertedUser = userDao.getById(insertedUserId);
        assertEquals("Duncanyo", insertedUser.getFirstName());
    }

    @Test
    void delete() {
        userDao = new UserDao();
        userDao.delete(userDao.getById(2));
        assertNull(userDao.getById(2));
    }

    @Test
    void deleteWithOrders() {
        // create the userDao
        userDao = new UserDao();

        // get the user we want to delete that has 2 orders associated
        User userToBeDeleted = userDao.getById(3);
        List<Order> orders = userToBeDeleted.getOrders();

        // get the associated order numbers
        int orderNumber1= orders.get(0).getId();
        int orderNumber2= orders.get(1).getId();

        // delete the user
        userDao.delete(userToBeDeleted);

        // verify the user was deleted
        assertNull(userDao.getById(3));

        // verify the orders were also deleted
        OrderDao orderDao = new OrderDao();
        assertNull(orderDao.getById(orderNumber1));
        assertNull(orderDao.getById(orderNumber2));
    }

    @Test
    void getAll() {
        userDao = new UserDao();
        List<User> users = userDao.getAll();
        assertEquals(6, users.size());
    }

    @Test
    void getByPropertyEqual() {
        userDao = new UserDao();
        List<User> users = userDao.getByPropertyLike("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    @Test
    void getByPropertyLike() {
        userDao = new UserDao();
        List<User> users = userDao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }
*/