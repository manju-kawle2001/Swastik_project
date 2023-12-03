package com.swastik.controlar;

<<<<<<< HEAD
=======
import com.swastik.model.AccountOpenDao;
import com.swastik.model.AccountOpenDto;
import com.swastik.other.Message;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
=======
import com.swastik.service.MailServices;
>>>>>>> 68183cabc11db5d135775b38c23ce894ef69e6b6
=======
>>>>>>> cf5cb20333c273c5ca71f02ec7647db76e06eb39
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

            HttpSession session = request.getSession();
           

//            if (request.getParameter("loginbtn") != null && request.getParameter("loginbtn").equals("Login")) {
                if (b) {
                    session.setAttribute("activeUser", ClDao);
                    response.sendRedirect("Customer/CustomerDashboard.jsp");
                } else {
                    Message message = new Message("Invalid details! Try again!!", "error", "alert-danger");
                    session.setAttribute("message", message);
                    response.sendRedirect("View/Login.jsp");
                }
//            } else if (request.getParameter("sendOtpbtn") != null && request.getParameter("sendOtpbtn").equals("Send OTP")) {
//                MailServices email = new MailServices();
//                int otp = MailServices.otpGenerat();
//                email.createAndSendEmail("Account varification in Swastik...", " Dear swastik user. ,\n the one time OTP to reset your password at (swastik Account) is " + otp + ".\n \n This OTP will expire in 5 minutes. ");
//                Message message = new Message("Otp Send On Your Gmail!", "error", "alert-danger");
//                session.setAttribute("message", message);
//                response.sendRedirect("View/Login.jsp");
//            }
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
