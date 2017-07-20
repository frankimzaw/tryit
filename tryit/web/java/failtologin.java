
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class failtologin extends HttpServlet {
    //doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>fail to login</title></head>");
        out.println("<body>");
        out.println("<p>user imformation din't match</p>");
        out.println("<a >Click here to try again</a>");
        out.println("</body></html>");


    }

    //doPost
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request,response);
    }
    //destroy
    public void destroy() {
    }
}
