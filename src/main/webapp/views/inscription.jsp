<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
<section class="container mt-3">
    <!-- Verifier si un erreur est apparu  -->
    <% Boolean isError = (Boolean) request.getAttribute("error");
      if(isError!=null && isError == true) {%>
        <h3 class="text text-danger text-center"><%= "Oops,erreur !!! Vous devez remplir tous les champs" %></h3>
     <% } %>
    <h1 class="text-center text-primary">Ajouter un client :</h1>

    <div class="row justify-content-center">
        <div class="col-6">
            <div class="card">
                <h6 class="card-header text-center">Espace Client</h6>
                <div class="card-body">
                    <form action=<%= request.getContextPath()+"/creerClient" %> method="POST">
                        <label for="nom" class="form-label">Nom :</label>
                        <input type="text" name="nom" class="form-control" id="nom">

                        <label for="prenom" class="form-label">Prenom: </label>
                        <input type="text" name="prenom" class="form-control" id="prenom">
                        
                        
                        <label for="tel" class="form-label">Telephone: </label>
                        <input type="text" name="telephone" class="form-control" id="tel">
                        
                        <label for="email" class="form-label">Email : </label>
                        <input type="email" name="email" class="form-control" id="email">

                        <input type="submit" value="Ajouter Client" class="btn btn-success mt-3 col-12">
                    </form>
                </div>
                <h6 class="card-footer text-center">Application de gestion de client</h6>
            </div>
        </div>
    </div>
</section>
</body>
</html>