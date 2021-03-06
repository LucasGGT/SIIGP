<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIIGP</title>
        <link rel="stylesheet" href="style.css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    </head>
    <body class="text-center">
    <c:if test="${logado}">

        <div>
            <nav>
                <ul>
                    <li><a href="Servlet?acao=pagInicio">Inicio</a></li>
                    <li><a href="Servlet?acao=EscolherPericia">Cadastro de atendimento</a></li>
                    <li><a href="Servlet?acao=CadastroPericia">Cadastro de perícia</a></li>
                    <li><a href="Servlet?acao=verAtendimento">Ver atendimento</a></li>
                    <li><a href="Servlet?acao=verPericia">Ver perícia</a></li>
                    <li><a href="Servlet?acao=verRelatorio">Relatórios</a></li>
                    <li><a href="Servlet?acao=Logout">Logout</a></li>
                </ul>
            </nav>
        </div>
        <h6 style="color: green;">${mensagem}</h6>
        <h2>Edição de Perícia</h2>
        
        <form action="Servlet" method="post">
            <input type="hidden" name="acao" value="EditarPericia" />
            <label for="nome">Nome: </label>
            <input type="text" name="nome" placeholder="Nome" required="required" maxlength="50"/> <br /> <br />
            <label for="descricao">Descrição: </label>
            <input type="text" name="descricao" placeholder="Descrição" required="required" maxlength="255"/> <br /> <br />
            <label for="conclusao">Conclusão: </label>
            <input type="text" name="conclusao" placeholder="Conclusão" required="required" maxlength="50"/> <br /> <br />
            <label for="local">Local: </label>
            <input type="text" name="local" placeholder="Local" required="required" maxlength="50"/> <br /> <br />
            <input type="submit" placeholder="Editar" value="Editar"/>
        </form>
    </c:if>
    </body>
</html>