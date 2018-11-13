package com.imooc.main.servlet;

import com.imooc.main.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by TangTian on 2018/10/14.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//接收数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<User> list = (List<User>) this.getServletContext().getAttribute("list");
        for (User user:list){
            //判断用户名是否正确
            if (username.equals(user.getUsername())){
                //密码正确
                if(password.equals(user.getPassword())) {
                    //密码也正确，登录成功
                    request.getSession().setAttribute("user", user);
                    response.sendRedirect("/server.jsp");
                    return;
                }
            }
        }
        //登录失败
        request.setAttribute("msg","用户名或者密码错误");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
