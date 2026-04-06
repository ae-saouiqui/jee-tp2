package com.example.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.models.Client;

@WebServlet("/creerClient")
public class CreerClient extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom  = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String tel = req.getParameter("telephone");
        String email = req.getParameter("email");
        // Verifier est-ce que tous les champs sont bien remplis :
        if(!nom.trim().isEmpty() && !prenom.trim().isEmpty() && !tel .trim().isEmpty() && !email.trim().isEmpty()){
            // Creer un client
            Client client =  new Client(email, nom, prenom, tel);
            req.setAttribute("client",client);
            RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/infoClient.jsp");
            rd.forward(req, resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("views/inscription.jsp");
            req.setAttribute("error", true);
            rd.forward(req, resp);
        }


        
    }
    

    
}
