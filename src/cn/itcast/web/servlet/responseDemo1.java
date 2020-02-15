package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseDemo1")
public class responseDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo0被访问了");
        //访问demo1，会自动跳转到demo6
//        //1.设置状态码为302
//        response.setStatus(302);
//        //2.设置响应头location
//        response.setHeader("location","/untitled3_war_exploded/responseDemo2");
        //3.简单的重定向方法
        response.sendRedirect("/untitled3_war_exploded/responseDemo2");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            this.doPost(request,response);
//        System.out.println("");
    }
}
