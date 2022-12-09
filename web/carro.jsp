<%-- 
    Document   : carro
    Created on : 05/12/2022, 01:38:46
    Author     : luzon
--%>

<%@page import="java.util.List"%>
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
        <h1>Carros Cadastrados</h1>
        <a href="CadastroCarro.jsp"> Cadastrar um carro</a></br>
        <a href="index.html">Home</a>
        
        <% 
            String m = (String)session.getAttribute("msg");
            
            if(m != null) {
        %>
            <h2><%= m%></h2>
        <% 
                session.removeAttribute("msg");
            }
        %>
        
        <%
            List<Carro> carros = (List<Carro>)session.getAttribute("listaCarros");
        %>
        
        <table>
            <tr>
                <th>Código</th>
                <th>Nome</th>
                <th>Marca</th>
                <th>Ano</th>
                <th>Cor</th>
                <th>Operações</th>
            </tr>
        <%
            for(Carro c: carros) {
        %>
            <tr>
                <td><%= c.getCodigo() %></td>
                <td><%= c.getNome() %></td>
                <td><%= c.getMarca() %></td>
                <td><%= c.getAno() %></td>
                <td><%= c.getCor() %></td>
                <td>
                    <a href="CarroServlet?codigo=<%= c.getCodigo() %>&operacao=v">Visualizar</a>
                    <a href="CarroServlet?codigo=<%= c.getCodigo() %>&operacao=a">Alterar</a>
                    <a href="CarroServlet?codigo=<%= c.getCodigo() %>&operacao=d">Deletar</a>
                </td>
            </tr>
        <% } %>
        </table>
    </body>
</html>
