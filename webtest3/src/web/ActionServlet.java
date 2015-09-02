package web;

import dao.EmployeeDAO;
import entity.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by EYlee on 7/26/15.
 */
@WebServlet(name = "ActionServlet")
public class ActionServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1 获得请求资源路径
        request.setCharacterEncoding("utf-8");
        String uri = request.getRequestURI();
        //2分析请求资源路径
        String action = uri.substring(uri.lastIndexOf("/"), uri.lastIndexOf("."));
        //3 依据分析结果，调用不同的分支处理
        if (action.equals("/list")) {

            EmployeeDAO dao = new EmployeeDAO();
            try {
                List<Employee> employees = dao.findAll();

                //使用转发，将处理转交给empList.jsp
                //step1 绑定数据
                request.setAttribute("emplist", employees);
                //step2 获得转发器
                RequestDispatcher rd = request.getRequestDispatcher("empList.jsp");
                //step3 转发
                rd.forward(request, response);


            } catch (Exception e) {
                e.printStackTrace();
//            request.setAttribute("error_msg","系统繁忙,稍后重试");
//            request.getRequestDispatcher("error.jsp").forward(request,response);
                //将异常抛给容器，容器捕获到异常后怎么处理？
                //
                throw new ServletException(e);
            }
        } else if (action.equals("/add")) {


            int id = Integer.parseInt(request.getParameter("id"));
            String LastName = request.getParameter("LastName");
            String FirstName = request.getParameter("FirstName");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");

            response.setContentType("text/html;charset=utf-8");

            //PrintWriter out = response.getWriter();

//        out.println("姓名"+name+"<br>");
//        out.println("薪水"+salary+"<br>");
//        out.println("年龄"+age+"<br>");
//        out.println("<a href='add.html'>员工列表</a>");


            try {
                EmployeeDAO dao = new EmployeeDAO();
                Employee e = new Employee();
                e.setId(id);
                e.setLastName(LastName);
                e.setFirstName(FirstName);
                e.setAddress(Address);
                e.setCity(City);
                dao.save(e);
                // out.println("Add success");
                //setTimeout(function(){
                //location='list' ,1000);
//            out.println("<a href='list'>check table</a>");

                response.sendRedirect("list.do");
                System.out.println("重定向后的代码");

            } catch (Exception e) {
                e.printStackTrace();
                throw new ServletException(e);
            }

        } else if (action.equals("/del")) {
            int id = Integer.parseInt(request.getParameter("id"));


            try {
                EmployeeDAO dao = new EmployeeDAO();
                dao.delete(id);

                response.sendRedirect("list.do");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else if(action.equals("/load")){
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            int id = Integer.parseInt(request.getParameter("id"));
           // PrintWriter out = response.getWriter();


            try {
                EmployeeDAO dao = new EmployeeDAO();
                Employee e = dao.findByID(id);

                //使用转发，转发给updateEmp.jsp
                //1绑定数据
                request.setAttribute("e",e);
                //2获得转发器，并转发
                request.getRequestDispatcher("updateEmp.jsp").forward(request,response);
            } catch (Exception e) {
                e.printStackTrace();
                throw new ServletException(e);

            }
        }else if(action.equals("/modify")){
           request.setCharacterEncoding("utf-8");
           response.setContentType("text/html;charset=utf-8");

            //PrintWriter out = response.getWriter();
            int id = Integer.parseInt(request.getParameter("id"));
            String LastName = request.getParameter("LastName");
            String FirstName = request.getParameter("FirstName");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            // Connection con = null;


            try {
                EmployeeDAO dao = new EmployeeDAO();
                Employee e = new Employee();
                e.setId(id);
                e.setLastName(LastName);
                e.setFirstName(FirstName);
                e.setAddress(Address);
                e.setCity(City);
                dao.modify(e);
                response.sendRedirect("list.do");


            } catch (Exception e) {
                e.printStackTrace();
                throw new ServletException(e);
            }
        }
    }


}
