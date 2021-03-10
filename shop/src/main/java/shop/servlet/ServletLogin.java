package shop.servlet;

import shop.bean.User;
import shop.dao.UserDao;
import shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "ServletLogin", urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");
        Writer writer = response.getWriter();
        UserDao userDao = new UserDaoImpl();
        User user = userDao.queryUserByUsername(username, password);

        if (user != null) {
            response.setHeader("location", "/shop/pages/user/login_success.html");
        } else {
            writer.write("<h1>用户名或密码错误</h1>");
        }

    }
}

