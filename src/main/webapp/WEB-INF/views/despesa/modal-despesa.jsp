<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<div class="modal fade" id="confirmaRemocaoModal" tabindex="-1" data-keyboard="false" data-backdrop="static">
    <div class="modal-dialog">
        <form action="/despesas" method="POST">
            <input type="hidden" name="_method" value="DELETE">

            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Confirmação</h4>
                </div>

                <div class="modal-body">
                   <span>Deseja realmente remover esta despesa?</span>
                </div>

                <div class="modal-footer">
                   <button type="button" class="btn btn-link" data-dismiss="modal">Cancelar</button>
                   <button type="submit" class="btn btn-primary" data-dismiss="modal">Confirmar</button>
                </div>
            </div>
        </form>
    </div>
</div>