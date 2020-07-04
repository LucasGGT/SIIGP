<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIIGP</title>
    </head>
    <body>
            <c:if test="${logado}">
                <h2 style="color: red;">Já está logado!</h2>
                <br /> <br />
                <a href="Servlet?acao=Inicio">Voltar</a>
            </c:if>
            <c:if test="${!logado}" >
                    
                    <h1>${erro}</h1>
                    <h1>Criar Conta</h1>
                    
                <form action="Servlet" method="post">
                    <input type="hidden" name="acao" value="CriarConta" />
                    <input type="text" name="usuario" placeholder="Usuário" /> <br /> <br />
                    <input type="password" name="senha" placeholder="Senha" /> <br /> <br />
                    <input type="text" name="nome" placeholder="Nome" /> <br /> <br />
                    <input type="text" name="descricao" placeholder="Descrição" /> <br /> <br />
                    <input id="date" type="date" name="data_nascimento" > <br /> <br />
                    <input type="submit" placeholder="Criar Conta" value="Criar Conta"/>
                </form>
                <a href="Servlet?acao=PagLogin">Voltar</a>
                    
            </c:if>
    </body>
</html>
