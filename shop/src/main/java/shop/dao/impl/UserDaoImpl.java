package shop.dao.impl;


import shop.bean.User;
import shop.dao.BaseDao;
import shop.dao.UserDao;

/**
 * @author WuLiangHang
 */
public class UserDaoImpl extends BaseDao implements UserDao{
    @Override
    public User queryUserByUsername(String username,String password) {
        String sql = "SELECT `id`, `username`, `password`, `email` FROM user WHERE `username` = ? and `password` = ?";
        return super.queryForOne(User.class, sql, username,password);
    }

    @Override
    public int addUser(String username,String password,String email) {
        String sql = "INSERT INTO `work3`.`user`( `username`, `password`, `email`) VALUES (?, ?, ?)";
        return super.update(sql,username,password,email);
    }

}
