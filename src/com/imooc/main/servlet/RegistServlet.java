package com.imooc.main.servlet;

import com.imooc.main.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TangTian on 2018/10/14.
 */
@WebServlet(name = "RegistServlet")
public class RegistServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String username = request.getParameter("username");
      String password = request.getParameter("password");
      String phone = request.getParameter("phone");
      String email= request.getParameter("email");
      String checkPwd = request.getParameter("checkPWD");
      request.setAttribute("username",username);


        Map<String,String> map = new HashMap<String,String>();

        map.put("username",username);
        map.put("password",password);
        map.put("phone",phone);
        map.put("email",email);
        System.out.println(map);

        List<User> userList = (List<User>) this.getServletContext().getAttribute("list");

        //校验用户名
        if (userList!=null){
            for (User u :userList){
                if(u.getUsername().equals(map.get("username"))){
                    request.setAttribute("msg","已存在用户名");

                    request.getRequestDispatcher("/regist.jsp").forward(request,response);
                    return;
                  }
               }
            }

       //封装数据
        User user = new User();
        user.setUsername(map.get("username"));
        user.setPassword(map.get("password"));
        user.setPhone(map.get("phone"));
        user.setEmail(map.get("email"));

        //将注册用户的信息存入到List集合中


    userList.add(user);
    for (User u : userList) {
        System.out.println(u);
    }

          this.getServletContext().setAttribute("list",userList);
          //注册成功，跳转到登录界面；
          request.getSession().setAttribute("username",user.getUsername());
          response.sendRedirect("/index.jsp");
      }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
