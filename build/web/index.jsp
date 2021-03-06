<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body class="text-center">
            <c:if test="${logado}">
                <h6 style="color: red;">Já está logado!</h6>
                <br /> <br />
                <a href="Servlet?acao=Inicio">Voltar</a>
            </c:if>
            <c:if test="${!logado}" >
                    
                    <h6 style="color: red;">${erro}</h6>

                    <form action="Servlet" method="post" style="padding-top: 150px;">
                         <h1>Login</h1>
                        <input type="hidden" name="acao" value="Logar" />
                        <input type="text" name="usuario" placeholder="Usuário" required="required" maxlength="50"/> <br /> <br />
                        <input type="password" name="senha" placeholder="Senha" required="required" maxlength="20"/> <br /> <br />
                        <input type="submit" placeholder="Logar" value="Entrar"/>
                    </form>
                    <a href="Servlet?acao=pagCriarConta">Criar Conta</a>

            </c:if>
    </body>
</html>
