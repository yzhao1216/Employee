package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by EYlee on 7/26/15.
 */
@WebServlet(name = "someServlet")
public class someServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println(username);
        //重定向
       // response.sendRedirect(request.getContextPath()+"/biz02/abc/a4.jsp");
        // 转发不写应用名
        request.getRequestDispatcher("/biz02/abc/a4.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
        System.out.println("******");
    }
}
