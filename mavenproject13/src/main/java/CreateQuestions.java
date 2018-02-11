///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//import fr.epita.hibernate.dao.AddQuestionDAO;
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
///**
// *
// * @author viquar
// */
//public class CreateQuestions extends HttpServlet {
//
// 
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//        try {
//         
//            
//       String question = request.getParameter("question");
//       String option1 = request.getParameter("option1");
//       String option2 = request.getParameter("option2");
//       String option3 = request.getParameter("option3");
//       String option4 = request.getParameter("option4");
//       String answer = request.getParameter("answer");
//            HttpSession session = request.getSession(true);
//       try {
//           AddQuestionDAO aqDAO = new AddQuestionDAO();
//           aqDAO.addUserDetails(question, option1, option2, option3, option4, answer);
//           response.sendRedirect("Success");
//       } catch (Exception e) {
//
//           e.printStackTrace();
//       }
//            
//            
//         
//        } finally {
//          
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
