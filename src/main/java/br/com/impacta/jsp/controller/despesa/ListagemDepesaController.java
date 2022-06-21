package br.com.impacta.jsp.controller.despesa;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/listagem")
public class ListagemDepesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping
    public ModelAndView listagemDespesas() {
//        List<Despesa> todasDespesas = despesaService.getLista();
        ModelAndView modelAndView = new ModelAndView("/despesa/listagem-de-despesa");
        modelAndView.addObject("despesas", despesaService.getLista());

        return modelAndView;
    }
}
