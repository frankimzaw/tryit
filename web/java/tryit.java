/**
 * Created by Administrator on 2017/7/19.
 */
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class tryit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.println("<html><head></head><body><p>WOW!  Congratuagtion</p>");
        out.println(request.getSession().getAttribute("user"));
        out.println("<span>,you just logged in</span>");
        out.println("</br>");
        out.println("<span>God damn!!!</span>");
        out.println("</br>");
        out.println("<b>still got long way to go....</b>");
        out.println("</br><div>Wait This is your sessionID:</div>");
        out.println(request.getSession().getId());
        out.println("</body></html>");
        out.close();
    }
    /* dopost */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request,response);
    }//destroy
    public void destroy() {}
}

