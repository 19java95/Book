package com.imooc.main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by TangTian on 2018/10/15.
 */
@WebFilter(filterName = "CharacterEncodingFilter")
public class CharacterEncodingFilter implements Filter {
    private FilterConfig config;
    public FilterConfig getConfig() {
        return config;
    }

    public void setConfig(FilterConfig config) {
        this.config = config;
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        request.setCharacterEncoding(config.getInitParameter("charset"));
        chain.doFilter(request,response);
    }

    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

}
