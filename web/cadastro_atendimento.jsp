<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIIGP</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <nav>
                <ul>
                    <li><a href="Servlet?acao=pagInicio">Inicio</a></li>
                    <li><a href="Servlet?acao=EscolherPericia">Cadastro de atendimento</a></li>
                    <li><a href="Servlet?acao=CadastroPericia">Cadastro de perícia</a></li>
                    <li><a href="Servlet?acao=verAtendimento">Ver atendimento</a></li>
                    <li><a href="Servlet?acao=verPericia">Ver perícia</a></li>
                </ul>
            </nav>
        </div>
        
        <h2>Cadastro de Atendimento</h2>
        
        <form action="Servlet" method="post">
            <input type="hidden" name="acao" value="CriaAtendimento" />
            <label for="data">Data: </label>
            <input id="date" type="date" name="date" > <br /> <br />
            <label for="descricao">Descrição: </label>
            <input type="text" name="descricao" placeholder="Descrição" /> <br /> <br />
            <input type="submit" placeholder="Criar" value="Criar"/>
        </form>
        
    </body>
</html>
