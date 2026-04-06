<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://cdn.jsdelivr.net/npm/@tailwindcss/browser@4"></script>
    <title>Document</title>
</head>
<body>
    <section class="w-full flex flex-col justify-items-center h-full p-5">
        <div class="w-full p-5 flex justify-center items-center">
            <h1 class="text-[100px] block">Bienvenue dans l'application de Gestion</h1>
        </div>
        <div class="flex flex-col items-center h-[500px] justify-center">
            <button class="bg-blue-900 p-[30px] flex justify-center items-center rounded-lg text-white mb-10 w-[300px] font-bold"><a href="views/inscription.jsp">Ajouter un client</a></button>
            <button class="bg-green-900 p-[30px] flex justify-center items-center rounded-lg text-white w-[300px] font-bold "><a href="views/reservation.jsp">Ajouter un reservation </a></button>
        </div>
    </section>
</body>
</html>