package cn.itcast.web.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //1.通过request对象获取
        ServletContext servletContext = request.getServletContext();
        //2.通过HttpServlet获取
        ServletContext servletContext1 = this.getServletContext();
        //获取数据
        Object msg=servletContext.getAttribute("msg");
        System.out.println(msg);



        String filename="a.jpg";
        String mineType=servletContext.getMimeType(filename);
        System.out.println(mineType);
        System.out.println(servletContext);
        System.out.println(servletContext1);
        System.out.println(servletContext==servletContext1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             this.doPost(request,response);
    }
}
