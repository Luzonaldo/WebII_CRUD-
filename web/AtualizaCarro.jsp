<%-- 
    Document   : AtualizaCarro
    Created on : 05/12/2022, 14:00:19
    Author     : luzon
--%>

<%@page import="br.edu.ifpe.webII.carro.model.entities.Carro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alterar Carrro já Cadastrado</h1>
        <%
            Carro c = (Carro)request.getAttribute("carro");
        %>
        
        <form method="post" action="CarroServlet">
            
            <input type="hidden" name="op" value="a"/>
            Código: <input type="hidden" name="codigo" value="<%= c.getCodigo() %>"/><%= c.getCodigo() %><br/>
            Nome: <input type="text" name="nome" value="<%= c.getNome() %>"/><br/>
            Marca: <input type="text" name="marca" value="<%= c.getMarca() %>"/><br/>
            Ano: <input type="text" name="ano" value="<%= c.getAno() %>"/><br/>
            Cor: <input type="text" name="cor" value="<%= c.getCor() %>"/><br/>
            
            <input type="submit" value="Cadastrar"/>
            
        </form>
    </body>
</html>
