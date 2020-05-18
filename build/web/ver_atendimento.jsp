<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nome da Aplicação</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <nav>
                <ul>
                    <li><a href="Servlet?acao=CadastroAtendimento">Cadastro de atendimento</a></li>
                    <li><a href="Servlet?acao=CadastroPericia">Cadastro de perícia</a></li>
                    <li><a href="Servlet?acao=verAtendimento">Ver atendimento</a></li>
                    <li><a href="Servlet?acao=verPericia">Ver perícia</a></li>
                </ul>
            </nav>
            <p>(Em desenvolvimento)</p>
        </div>
         <h1>Atendimentos</h1>
        <h2>Quantidade de atendimentos: ${Atendimentos.size()}</h2>

        <br /> <br />
        
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Perito</th>
                    <th>Data</th>
                    <th>Descricao</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${Atendimentos}" var="atendimento">
                    <tr>
                        <td>${atendimento.codigo}</td>

                        <td>${atendimento.perito}</td>

                        <td>${atendimento.dataCadastro}</td>
                        
                        <td>${atendimento.descricao}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
       
         
        
    </body>
</html>
