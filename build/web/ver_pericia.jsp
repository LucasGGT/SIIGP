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
        
        <h2>Visualização de Pericias</h2>
        
       <h1>Pericias</h1>
        <h2>Quantidade de pericias ${Pericia.size()}</h2>

        <br /> <br />
        
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Descricao</th>
                    <th>Conclusao</th>
                    <th>Local</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${pericias}" var="Pericia">
                    <tr>
                        <td>${Pericia.id}</td>

                        <td>${Pericia.nome}</td>

                        <td>${Pericia.descricao}</td>
                        
                        <td>${Pericia.conclusao}</td>
                        
                        <td>${Pericia.local}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>