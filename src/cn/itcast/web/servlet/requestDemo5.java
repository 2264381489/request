package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/requestDemo5")
public class requestDemo5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //1.获取字节输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //2.输出数据(getBtyes把前面的内容换成字节。这也是为什么不会乱码的原因，因为他也是默认gbk)
        outputStream.write("你好".getBytes());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
this.doPost(request,response);
    }
}
