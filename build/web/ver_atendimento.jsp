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
        
        <h2>Visualização de Atendimentos</h2>
        
         <h1>Atendimentos</h1>
        <h2>Quantidade de atendimentos: ${Atendimentos.size()}</h2>

        <br /> <br />
        
        <table class="table table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Id da Pericia</th>
                    <th>Data</th>
                    <th>Descricao</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${Atendimentos}" var="atendimento">
                    <tr>
                        <td>${atendimento.id}</td>
                        
                        <td>${atendimento.pericia_id}</td>               

                        <td>${atendimento.data}</td>
                        
                        <td>${atendimento.descricao}</td>
                        
                        <td>
                            <form action="Servlet" method="post">
                                <input type="hidden" name="acao" value="pagEditarAtendimento" />
                                <input type="number" name="atendimentoID" placeholder="ID" hidden="true" value="${atendimento.id}"/>
                                <input type="submit" placeholder="Editar" value="Editar"/>                         
                            </form> 
                        </td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
       
         
        
    </body>
</html>
