package com.imooc.main.servlet;

import com.imooc.main.CatalogueBook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TangTian on 2018/10/17.
 */
@WebServlet(name = "CatelogueAddServlet")
public class CatelogueAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> catagorymap = new HashMap<String,String>();
//把数据存到map中
        String catalogueId = request.getParameter("catalogueid");
        String catgoryName = request.getParameter("catgoryName");
        String catgorydescription = request.getParameter("catgorydescription");
        catagorymap.put("catalogueId",catalogueId);
        catagorymap.put("catgoryName",catgoryName);
        catagorymap.put("catgorydescription",catgorydescription);


//封装分类数据
        CatalogueBook catalogueBook =new CatalogueBook();

        catalogueBook.setCatalogueBookid(catagorymap.get("catalogueId"));
        catalogueBook.setCatalogueBookname(catagorymap.get("catgoryName"));
        catalogueBook.setCatalogueBookdescribe(catagorymap.get("catgorydescription"));

//把分类map集合添加到list中


        List<CatalogueBook> catagorylists = (List<CatalogueBook>)this.getServletContext().getAttribute("catagorylists");
        catagorylists.add(catalogueBook);
        this.getServletContext().setAttribute("catagorylists",catagorylists);
        response.sendRedirect("/catgory.jsp?flag=1");

        for (CatalogueBook cl : catagorylists){
            System.out.println(cl);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
