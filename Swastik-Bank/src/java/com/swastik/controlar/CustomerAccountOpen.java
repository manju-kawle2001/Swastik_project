package com.swastik.controlar;

import com.swastik.model.AccountOpenDao;
import com.swastik.model.AccountOpenDto;
import com.swastik.other.Message;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
//import java.io.PrintWriter;

public class CustomerAccountOpen extends HttpServlet {
<<<<<<< HEAD
    
=======

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            AccountOpenDto aoDto = new AccountOpenDto();
            AccountOpenDao aoDao = new AccountOpenDao();
            aoDao.setName(request.getParameter("firstName") + " " + request.getParameter("lastName"));
            aoDao.setFather(request.getParameter("fatherName"));
            aoDao.setMother(request.getParameter("motherName"));
            aoDao.setDob(request.getParameter("dob"));
            aoDao.setGender(request.getParameter("gender"));
//            aoDao.setImage(request.getParameter("image"));
            aoDao.setOccupation(request.getParameter("occupation"));
            aoDao.setMaritail(request.getParameter("maritailStatus"));
            aoDao.setMobile(request.getParameter("mobile"));
            aoDao.setEmail(request.getParameter("gmail"));
            aoDao.setAdhar(request.getParameter("adhar"));
            aoDao.setPan(request.getParameter("pan"));
            aoDao.setAddress(request.getParameter("address"));
            aoDao.setState(request.getParameter("state"));
            aoDao.setDistric(request.getParameter("distric"));
            aoDao.setCity(request.getParameter("city"));
            aoDao.setPincode(request.getParameter("pincode"));
            aoDao.setPassword(request.getParameter("password"));
<<<<<<< HEAD
            HttpSession session = request.getSession();
            if (aoDto.accountOpean(aoDao)) {
=======
            boolean a = aoDto.accountOpean(aoDao);
            boolean b;
//          =======================================================================
            HttpSession session = request.getSession();
            if (aoDto.accountOpenProcess(aoDao)) {
                aoDao.setAccType(request.getParameter("accounttype"));
                aoDao.setBalance(0.0d);
                aoDao.setBranchId(701);
                aoDao.setAccStatus("Active");
                b = aoDto.accountDetail(aoDao);
            } else {
                aoDto.deleteCustomer(aoDao);
                Message message = new Message("Invalid details! Try again!!", "error", "alert-danger");
                session.setAttribute("message", message);
                response.sendRedirect("View/CAccountOpean.jsp");
                return;
            }
            

            if (a && b) {
>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
                System.out.println("customer login");
                response.sendRedirect("View/Login.jsp");
//                HttpSession session = request.getSession();
                session.setAttribute("AccountOpenDao", aoDao);
            } else {
<<<<<<< HEAD
                Message message = new Message("Invalid details! Try again!!", "error", "alert-danger");
                session.setAttribute("message", message);
            }
            
        } catch (Exception e) {
        }
    }
    
=======
                aoDto.deleteCustomer(aoDao);
                Message message = new Message("Invalid details! Try again!!", "error", "alert-danger");
                session.setAttribute("message", message);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
<<<<<<< HEAD
    
=======

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
<<<<<<< HEAD
    
=======

>>>>>>> 6f9248faf005b41d0c64d6577294c80ce91eee35
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
