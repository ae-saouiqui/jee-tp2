package com.example.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.models.Client;
import com.example.models.Reservation;


@WebServlet("/creerReservation")
public class CreerReservation extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom  = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String tel = req.getParameter("telephone");
        String email = req.getParameter("email");
        String type  = req.getParameter("type");
        double prix = Double.parseDouble(req.getParameter("prix"));
        if(!nom.trim().isEmpty() && !prenom.trim().isEmpty() && !tel.trim().isEmpty() && !email.trim().isEmpty() && !type.trim().isEmpty() && prix != 0.0 ){

            Client client = new Client(email, nom, prenom, tel);
            Reservation reservation = new Reservation(client, prix, type);   
            req.setAttribute("reservation", reservation);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/infoReservation.jsp");
            dispatcher.forward(req, resp);
        }else {
            RequestDispatcher rd = req.getRequestDispatcher("views/reservation.jsp");
            req.setAttribute("error", true);
            rd.forward(req, resp);
        }

    }

    
}
