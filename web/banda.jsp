<%-- 
    Document   : banda
    Created on : 16/09/2019, 00:32:22
    Author     : emers
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="classes.DB"%>
<%@page import="classes.banda"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bandas</title>
    </head>
    <body>
        <%@ include file="WEB-INF/jspf/menu.jspf" %>
        <div align="center">
        <h1>BANDAS</h1>
        <h4><a href="addBanda.jsp">Adicionar Banda</a><</h4>
        <table border="1">
            <tr>
                <th>Indice</th>
                <th>Nome</th>
                <th>Genero</th>
                <th>Discos</th>
                <th>Comandos</th>
                
            </tr>
            <% for(banda b:DB.getBandas()){ %>
            <tr>
                <td><%= DB.getBandas().indexOf(b) %></td>
                <td><%= b.getNome() %></td>
                <td><%= b.getGenero() %></td>
                <td><%= b.getQtdisco() %></td>
                <td>
                    <a href="altBanda.jsp?banda=<%= DB.getBandas().indexOf(b)%>">Alterar</a>
                    <a href="exBanda.jsp?banda=<%= DB.getBandas().indexOf(b)%>">Excluir</a>
                </td>
            </tr>
            <% } %>
            
        </table>
        
        </div>
    </body>
</html>
