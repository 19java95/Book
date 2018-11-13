package com.imooc.main.servlet;

import com.imooc.main.Book;
import com.imooc.main.CatalogueBook;
import com.imooc.main.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TangTian on 2018/10/14.
 */
public class InitServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("shushihua");
        // 创建一个List集合用于保存用户注册的信息:
        List<User> list = new ArrayList<User>();
        //创建一个list集合用于保存图书总类
        List<CatalogueBook> catagorylists = new ArrayList<CatalogueBook>();
        //创建一个list集合用于保存图书
        List<Book> books =new ArrayList<Book>();

        // 将list保存到ServletContext作用域中:
        this.getServletContext().setAttribute("list", list);
        this.getServletContext().setAttribute("catagorylists",catagorylists);
        this.getServletContext().setAttribute("books",books);
    }
}
