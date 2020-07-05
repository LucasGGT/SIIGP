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
    <body>
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
    </c:if>
    </body>
</html>
