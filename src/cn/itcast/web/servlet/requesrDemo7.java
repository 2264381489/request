package cn.itcast.web.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet( "/requestDemo7")
public class requesrDemo7 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo666被访问了");
        //转发到demo9资源
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestDemo9");
//        requestDispatcher.forward(request,response);
        //转发到demo9资源
        request.setAttribute("mag","hell0");
        request.getRequestDispatcher("/requestDemo9").forward(request,response);
//        request.setAttribute("mag","hell0");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username=request.getParameter("username");
////        System.out.println("get");
////        System.out.println(username);
        this.doPost(request,response);
    }
}
