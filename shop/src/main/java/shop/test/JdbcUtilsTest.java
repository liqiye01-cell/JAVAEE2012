package shop.test;


import org.junit.Test;
import shop.utils.JdbcUtils;

import java.sql.Connection;

/**
 * @author WuLiangHang
 */
public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils() {
        for (int i = 0; i < 100; i++) {
            Connection con = JdbcUtils.getConnection();
            System.out.println(con);
            JdbcUtils.close(con);
        }
    }
}
