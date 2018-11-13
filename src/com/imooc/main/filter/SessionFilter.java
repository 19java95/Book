package com.imooc.main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by TangTian on 2018/10/15.
 */
@WebFilter(filterName = "SessionFilter")
public class SessionFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest hrequest = (HttpServletRequest)request;
        HttpServletResponse hresopnse = (HttpServletResponse)response;

        String username = (String)hrequest.getSession().getAttribute("username");
        if (username == null){
            hresopnse.sendRedirect(hrequest.getContextPath()+"/index.jsp?flag=1");
            return;
        }else {
            chain.doFilter(hrequest,hresopnse);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
