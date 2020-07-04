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

       <h1>Escolha uma Pericia</h1>
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
                <c:forEach items="${Pericias}" var="Pericia">
                    <tr>
                        <td>${Pericia.id}</td>

                        <td>${Pericia.nome}</td>

                        <td>${Pericia.descricao}</td>
                        
                        <td>${Pericia.conclusao}</td>
                        
                        <td>${Pericia.local}</td>
                                                
                        <td>
                            <form action="Servlet" method="post">
                                <input type="hidden" name="acao" value="CadastroAtendimento" />
                                <input type="number" name="periciaID" placeholder="ID" hidden="true" value="${Pericia.id}"/>
                                <input type="submit" placeholder="Selecionar" value="Selecionar"/>                         
                            </form> 
                        </td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>
