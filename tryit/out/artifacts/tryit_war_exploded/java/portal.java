/**
 * Created by Administrator on 2017/7/20.
 */

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class portal extends HttpServlet {
    //doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user=request.getParameter("user");
        String password=request.getParameter("password");

        if("Frankim".equals(user)&&"aa111555".equals(password)){
            RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/MyServlet");
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
