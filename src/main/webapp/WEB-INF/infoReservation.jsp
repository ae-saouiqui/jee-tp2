<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>

        <!-- Importer la classe client et Reservation -->
         <%@ page import="com.example.models.Client" %>
         <%@ page import="com.example.models.Reservation" %>
    <title>Document</title>
</head>
<body>
    <section class="container justify-content-center">
        <h3 class="text-success mt-4 col-12 text-center">Reservation  Ajoute avec succes</h3>
        <div class="container col-12">
            <h1 class="col-6 text-primary">Affichage des donnee Reservation : </h1>
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">Nom : </th>
                        <th scope="col">Prenom :</th>
                        <th scope="col">telephone : </th>
                        <th scope="col">email : </th>
                        <th scope="col">prix : </th>
                        <th scope="col">type : </th>
                    </tr>
                </thead>
                <% 
                Reservation reservation = (Reservation) request.getAttribute("reservation");
                Client cli = reservation.getClient();
                if (reservation != null) {
                    out.println("<tbody>");
                    out.println("<tr>");
                    out.println("<td>"+cli.getNom()+"</td>");
                    out.println("<td>"+cli.getPrenom()+"</td>");
                    out.println("<td>"+cli.getTelephone()+"</td>");
                    out.println("<td>"+cli.getEmail()+"</td>");
                    out.println("<td>"+reservation.getPrix()+"</td>");
                    out.println("<td class=\"text-capitalize\">"+reservation.getType()+"</td>");
                    out.println("</tr>");
                    out.println("</tbody>");
                    out.println("</table>");
                }
                %>
            </table>
            <button class="p-3 btn btn-primary"><a class="link-opacity-100 link-underline link-underline-opacity-0 link-light" href=<%= request.getContextPath()%>>Retourne au formulaire d'ajout</a></button>
        </div> 
    </section>
    </body>
</html>