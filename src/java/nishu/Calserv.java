
package nishu;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calserv extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        int x,y;
        String str="";
        x=Integer.parseInt(request.getParameter("txtfno"));
        y=Integer.parseInt(request.getParameter("txtsno"));
        str=request.getParameter("operation");
        if(str.equals("add")){
            out.println("<h1>Result of addition is:"+(x+y) +"</h1>");
        }
        else if(str.equals("sub")){
            out.println("<h1>Result of subtraction is:"+(x-y)+"</h1>");
        }
        else if(str.equals("mul")){
            out.println("<h1>Result of Multiplication is:"+(x*y)+"</h1>");
        }
        else if(str.equals("div")){
            out.println("<h1>Result of division is:"+(x/y)+"</h1>");
        }
        else{
            out.println("<h1>Result of modulus is:"+(x%y)+"</h1>");
        }
        
        
    }
}
