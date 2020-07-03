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
                    <li><a href="Servlet?acao=EscolherPericia">Cadastro de atendimento</a></li>
                    <li><a href="Servlet?acao=CadastroPericia">Cadastro de perícia</a></li>
                    <li><a href="Servlet?acao=verAtendimento">Ver atendimento</a></li>
                    <li><a href="Servlet?acao=verPericia">Ver perícia</a></li>
                </ul>
            </nav>
            <p>(Em desenvolvimento)</p>
        </div>
        
        <h2>Cadastro de Perícia</h2>
        
        <form action="Servlet" method="post">
            <input type="hidden" name="acao" value="CriaPericia" />
            <label for="nome">Nome: </label>
            <input type="text" name="nome" placeholder="Nome do Perito" /> <br /> <br />
            <label for="descricao">Descrição: </label>
            <input type="text" name="descricao" placeholder="Descrição" /> <br /> <br />
            <label for="conclusao">Conclusão: </label>
            <input type="text" name="conclusao" placeholder="Conclusão" /> <br /> <br />
            <label for="local">Local: </label>
            <input type="text" name="local" placeholder="Local" /> <br /> <br />
            <input type="submit" placeholder="Criar" value="Criar"/>
        </form>
        
    </body>
</html>