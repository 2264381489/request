package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * servlet路径配置
 */
//@WebServlet({"/d4","/dd4","/ddd4"})
//    @WebServlet("/user/demo")
//@WebServlet("/user/*")
@WebServlet("*.do")
public class servletDemo4 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("输出了！！！！！");
        System.out.println(req);
    }
}
