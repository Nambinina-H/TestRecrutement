package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CoursModel;
import javax.servlet.RequestDispatcher;
import util.HibernateUtil;

@WebServlet(name = "CoursController", urlPatterns = {"/CoursController"})
public class CoursController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CoursController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CoursController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("ajouterCours")!=null){
            request.setAttribute("Cours", "Cours");
            int codecours = Integer.parseInt(request.getParameter("codecours"));
            String Titre = request.getParameter("Titre");
            String Contenu = request.getParameter("Contenu");
            String Categorie = request.getParameter("Categorie");
            CoursModel cm = new CoursModel();
             try {
                cm.ajouterCours(codecours, Titre, Contenu, Categorie);
                HibernateUtil.sessionFactory.close();
                request.setAttribute("message", "Le cours avec le <b>codecours " + codecours + "</b>" + " a été ajouté avec succès.");
                request.setAttribute("messageBackgroundColor", "green");
                } catch (Exception e) {
            request.setAttribute("message", "Le cours avec le <b>codecours " + codecours + "</b>" + " existe déjà. Veuillez insérer un autre identifiant !");
            request.setAttribute("messageBackgroundColor", "orange");
            }
            RequestDispatcher rd = request.getRequestDispatcher("ajouter.jsp");
            rd.forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
