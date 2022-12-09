<%-- 
    Document   : CadastroCarro
    Created on : 03/11/2022, 17:09:39
    Author     : luzon
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Carros</h1>
        <a href="index.html">Home</a>
        <a href="CarroServlet">Carros Cadastrados</a>
        
        <% 
            String m = (String)session.getAttribute("msg");
            
            if(m != null){
        %>
        <h2><%= m%></h2>
        <%
            session.removeAttribute("msg");
            }
        %>
        
         <form method="post" action="CarroServlet">
            
            Codigo:<input type="text" name="codigo" /><br/>
            Nome:<input type="text" name="nome" /><br/>
            Marca:<input type="text" name="marca" /><br/>
            Ano:<input type="text" name="ano" /><br/>
            cor:<input type="text" name="cor" /><br/>
            
            <input type="submit" value="cadastrar"/>
            
        </form>
    </body>
</html>
