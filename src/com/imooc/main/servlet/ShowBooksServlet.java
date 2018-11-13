package com.imooc.main.servlet;

import com.imooc.main.Book;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


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
@WebServlet(name = "ShowBooksServlet")
public class ShowBooksServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setContentType("text/html;charset=utf-8");
     String bookID =  request.getParameter("bookID");
     String bookName = request.getParameter("bookName");
     String catgoryName2 = request.getParameter("catgoryName2");
     List<Book> books2 = (List<Book>)this.getServletContext().getAttribute("books1");
        //转化为json
     response.getWriter().print(JSONArray.fromObject(books2).toString());

      /*  JSONObject jsonObject = null;
        for (Book book : books2){
            if (bookID==null&&bookName==null&&catgoryName2==null){
                jsonObject = JSONObject.fromObject("{flag:ture}");
                System.out.println("wucanshu");
            }else if (bookID.equals(book.getBookId())){
                jsonObject = JSONObject.fromObject("{flag:false}");
            }
        }

        response.getOutputStream().write(jsonObject.toString().getBytes("utf-8"));*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
