package shop.servlet;

import shop.dao.UserDao;
import shop.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servletzc",urlPatterns = "/zc")
public class Servletzc extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(302);
      String username =   request.getParameter("username");
        String password =   request.getParameter("password");
        String email =   request.getParameter("email");

        UserDao userDao = new UserDaoImpl();
        userDao.addUser(username,password,email);
        response.setHeader("location","/shop/pages/user/regist_success.html");
//        request.getRequestDispatcher("/pages/user/regist_success.html").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
