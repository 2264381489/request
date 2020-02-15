package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo4")
public class responseDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("demo2运行了");
        //获取流对象之前，设置流的默认编码ISO...设置为utf-8
        response.setCharacterEncoding("utf-8");
        //告诉浏览器，服务器发送的消息体数据的编码，建议浏览器使用该编码解码
//        response.setHeader("content-type","text/html;character=utf-8");
        //简单的行是，来设置编码
        response.setContentType("text/html;character=utf-8");

        //获取字符串输出流
        PrintWriter printWriter= response.getWriter();
        //输出数据
        printWriter.write("<h1>hello respo</h1>");
        //中文会乱吗
        printWriter.write("<h1>hello你好啊啊啊啊啊 respo</h1>");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost(request,response);
    }
}
