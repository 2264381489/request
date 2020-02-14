package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class servletDemo2 implements Servlet {
    /**
     * 初始化方法，在servlet被创建的时候执行。只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.......");
    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    /**
     * 每次servlet被访问的时候，执行，执行多次
     * @return
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service.......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 在servlet正常关闭时执行，执行，执行一次。
     */
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}
