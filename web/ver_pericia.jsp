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
        
        <h2>Visualização de Pericias</h2>
        
         <h1>Pericias</h1>
        <h2>Quantidade de atendimentos: ${Pericias.size()}</h2>

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
                <c:forEach items="${Pericias}" var="pericia">
                    <tr>
                        <td>${pericia.id}</td>
                        
                        <td>${pericia.nome}</td>               
                        
                        <td>${pericia.descricao}</td>
                        
                        <td>${pericia.conclusao}</td>
                        
                        <td>${pericia.local}</td>
                        
                        <td>
                            <form action="Servlet" method="post">
                                <input type="hidden" name="acao" value="pagEditarPericia" />
                                <input type="number" name="periciaID" placeholder="ID" hidden="true" value="${pericia.id}"/>
                                <input type="submit" placeholder="Editar" value="Editar"/>                         
                            </form> 
                        </td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        
    </body>
</html>
