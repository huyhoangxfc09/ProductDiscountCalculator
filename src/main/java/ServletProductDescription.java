import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Servlet-Product-Description", value = "/ServletProductDescription")
public class ServletProductDescription extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("Product Description");
        double price = Double.parseDouble(request.getParameter("List Price"));
        double discountPercent = Double.parseDouble(request.getParameter("Discount Percent"));
        RequestDispatcher dispatcher = request.getRequestDispatcher("display-discount.jsp");
        dispatcher.forward(request,response);
    }
}
