/**
 * Created by Administrator on 2017/7/20.
 */

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import userbean.userbean;
import userbean.checkbean;

public class portal extends HttpServlet {
    //doGet
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String account=request.getParameter("user");
        String password=request.getParameter("password");

        //use javabean
       /*userbean user=new userbean();
        user.setAccount(account);
        user.setPassword(password);

        checkbean checkbean=new checkbean(user);
        if(checkbean.validate()){
            RequestDispatcher rd=request.getRequestDispatcher("/MyServlet");
            rd.forward(request,response);
        }
        else {
            RequestDispatcher rd=request.getRequestDispatcher("/failtologin");
            rd.forward(request,response);
        }*/

       if("Frankim".equals(account)&&"aa111555".equals(password)){
          //  RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/MyServlet");
          //  rd.forward(request,response);
            HttpSession session=request.getSession();
            session.setAttribute("user",account);
           // response.sendRedirect("/MyServlet");
           RequestDispatcher rd=request.getRequestDispatcher("/MyServlet");
           rd.forward(request,response);
        }
        else{
            RequestDispatcher rd=request.getRequestDispatcher("/failtologin");
            rd.forward(request,response);
        }
    }
    //doPost
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request,response);
    }
    //destroy
    public void destroy() {
    }
}
