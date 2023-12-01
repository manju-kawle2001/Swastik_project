package com.swastik.controlar;

<<<<<<< HEAD
=======
import com.swastik.model.AccountOpenDao;
import com.swastik.model.AccountOpenDto;
import com.swastik.other.Message;
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
<<<<<<< HEAD
=======
import jakarta.servlet.http.HttpSession;
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
import java.io.IOException;

public class CustomerLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
<<<<<<< HEAD

        } catch (Exception e) {
=======
            AccountOpenDto ClDto = new AccountOpenDto();
            AccountOpenDao ClDao = new AccountOpenDao();
            ClDao.setEmail(request.getParameter("gmail"));
            ClDao.setPassword(request.getParameter("password"));
            boolean b = ClDto.customerLogin(ClDao);

            if (b) {
                HttpSession session = request.getSession();
                session.setAttribute("activeUser", ClDao);
                Message message = new Message("Invalid details! Try again!!", "error", "alert-danger");
                session.setAttribute("message", message);
                response.sendRedirect("Customer/CustomerDashboard.jsp");
            } else {
                response.sendRedirect("View/Login.jsp");
            }
        } catch (IOException e) {
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
            System.out.println(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
