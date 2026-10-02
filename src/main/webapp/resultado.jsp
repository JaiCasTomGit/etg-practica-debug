<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // PUNTO DE RUPTURA 4: la ejecución se detiene aquí dentro de la JSP
    String saludo = (String) request.getAttribute("saludo");
    Integer hora = (Integer) request.getAttribute("hora");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1><%= saludo %></h1>
    <p>La hora del servidor era: <%= hora %>:00</p>
    <a href="index.jsp">Volver</a>
</body>
</html>