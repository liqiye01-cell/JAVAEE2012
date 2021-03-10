package shop.test;


import org.junit.Test;
import shop.dao.UserDao;
import shop.dao.impl.UserDaoImpl;

/**
 * @author WuLiangHang
 */
public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername(){
        System.out.println(userDao.queryUserByUsername("admin","123"));
//        userDao.addUser("admin1","12345","123321@qq.com");
    }
}
