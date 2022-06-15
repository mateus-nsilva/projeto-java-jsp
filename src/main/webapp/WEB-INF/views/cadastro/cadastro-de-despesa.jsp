<%@page pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Cadastro de Despesa</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
</head>

<body>
<nav class="navbar navbar-inverse navbar-static-top"></nav>

<form class="form-horizontal" action="/cadastrodespesa" method="post">
    <c:if test="${!empty mensagem}">
        <div class="alert alert-success">
            <span>${mensagem}</span>
        </div>
    </c:if>
</form>

<form class="form-horizontal" method="post" action="/cadastrodespesa">
    <div class="panel panel-default panel-heading">
        <h1 class="panel-title titulo">Nova Despesa</h1>
    </div>

    <div class="form-group">
        <label for="descricao" class="col-sm-2 control-label">Descrição</label>
        <div class="col-sm-4">
            <input id="descricao" type="text" class="form-control" name="descricao">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-2 control-label">Categoria</label>
        <div class="col-sm-2">
            <select class="form-control" name="categoria">
                <c:forEach items="${todasCategorias}" var="categoria">
                    <option value="${categoria}">${categoria}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <label for="data" class="col-sm-2 control-label">Data</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="data" name="data"/>
        </div>
    </div>

    <div class="form-group">
        <label for="valor" class="col-sm-2 control-label">Valor</label>
        <div class="col-sm-2">
            <input type="number" class="form-control" id="valor" name="valor"/>
        </div>
    </div>

    <div class="form-group">
        <label for="observacoes" class="col-sm-2 control-label">Observações</label>
        <div class="col-sm-2">
            <input type="text" class="form-control" id="observacoes" name="observacoes"/>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-primary">Salvar</button>
        </div>
    </div>
</form>
<script src="/js/bootstrap.js"></script>
</body>
</html>