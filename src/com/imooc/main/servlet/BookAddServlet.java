package com.imooc.main.servlet;

import com.imooc.main.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by TangTian on 2018/10/19.
 */
@WebServlet(name = "BookAddServlet")
public class BookAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String bookid = request.getParameter("bookid");
     String bookName = request.getParameter("bookName");
     String catgoryName1 = request.getParameter("catgoryName1");
     String price = request.getParameter("price");
     String bdescription = request.getParameter("bdescription");

        Book books =new Book();
        books.setBookId(bookid);
        books.setBookName(bookName);
        books.setCatgoryName1(catgoryName1);
        books.setBookPrice(price);
        books.setBookDescribe(bdescription);



        List<Book> books1 = (List<Book>)this.getServletContext().getAttribute("books");
        books1.add(books);
        this.getServletContext().setAttribute("books1",books1);
        response.sendRedirect("/addBook.jsp?flag=2");

        for (Book book: books1){
            System.out.println(book);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     doPost(request,response);
    }
}
