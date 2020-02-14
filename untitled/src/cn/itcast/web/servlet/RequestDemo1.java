package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 快速创建
 */

@WebServlet("/RequestDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        i) 获取请求方式：GET
//        One. String getMethod();
//        ii) 获取虚拟目录：/day14
//        One. String getContextPath()
//        iii) 获取servlet路径L/demo1
//        One. String getServletPath（）
//        iv) 获取get方式的请求参数：name-zhagnsan
//        One. String getQueryString();
//        v) 获取请求的URI：/day14/demo1
//        One. String getRequestURI();   /day14/demo1
//        Two. StringBuffer getRequestURL() :http://locaolhost/day14/demo1
//        vi) 获取客户机的IP地址：HTTP/1.1
//        One. String getProtocol（）
//        vii) 获取客户机的ip地址：
//        One. string getRemoteAddr（）；
              String method=request.getMethod();
        System.out.println(method);
        String con=request.getContextPath();
        System.out.println(con);
        String servlet=request.getServletPath();
        System.out.println(servlet);
        String query=request.getQueryString();
        System.out.println(query);
        String URI=request.getRequestURI();
        System.out.println(URI);
        StringBuffer URL= request.getRequestURL();
        System.out.println(URL);
       String pro= request.getProtocol();
        System.out.println(pro);
        request.getRemoteAddr();

    }
}
