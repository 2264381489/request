package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet( "/requestDemo6")
public class requesrDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //post获取请求参数
        //根据参数名称获取参数量（说白了就是获取前端的数据）
        String username=request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);
        //获取所有请求的参数名称（可以获取一堆）
//        String[] hobby = request.getParameterValues("hobby");
//        for(String hobbies:hobby){
//            System.out.println(hobbies);
//        }
//        Enumeration<String> para=request.getParameterNames();
//        while(para.hasMoreElements()){
//            String name=para.nextElement();
//            System.out.println(name);
//            String value = request.getParameter(name);
//            System.out.println(value);
//            System.out.println("-------------------------");
//        }
        //获取所有参数的map集合
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap=request.getParameterMap();
        Set<String> keyset=parameterMap.keySet();
        for (String name:keyset){
           String[] values=parameterMap.get(name);
            System.out.println(name);
            for (String value :values){
                System.out.println(value);
            }
            System.out.println("--------------------------------------");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String username=request.getParameter("username");
////        System.out.println("get");
////        System.out.println(username);
        this.doPost(request,response);
    }
}
