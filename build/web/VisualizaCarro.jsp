<%-- 
    Document   : VisualizaCarro
    Created on : 05/12/2022, 13:51:48
    Author     : luzon
--%>

<%@page import="br.edu.ifpe.webII.carro.model.entities.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, td, th {border: 1px solid green}
        </style>
    </head>
    <body>
        <h1>Carro Cadastrado</h1>
        
        <%
            Carro c = (Carro)session.getAttribute("carro");
        %>
        
        <a href="CarroServlet">Carros Cadastrados</a><br/>
        
        <table>
            <tr>
                <th>Código</th>
                <td><%= c.getCodigo() %></td>
            </tr>
            <tr>
                <th>Nome</th>
                <td><%= c.getNome()%></td>
            </tr>
            <tr>
                <th>Marca</th>
                <td><%= c.getMarca() %></td>
            </tr>
            <tr>
                <th>Ano</th>
                <td><%= c.getAno() %></td>
            </tr>
            <tr>
                <th>Cor</th>
                <td><%= c.getCor() %></td>
            </tr>
        </table>
    </body>
</html>
