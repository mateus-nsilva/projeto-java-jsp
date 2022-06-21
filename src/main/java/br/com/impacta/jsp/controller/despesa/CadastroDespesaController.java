package br.com.impacta.jsp.controller.despesa;

import br.com.impacta.jsp.model.Categorias;
import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.CategoriaService;
import br.com.impacta.jsp.service.DespesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesaController {

    @Autowired
    private DespesaService despesaService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ModelAndView getCadastroDespesa() {
        return new ModelAndView("/despesa/cadastro-de-despesa");
    }

    @PostMapping
    public ModelAndView salvar(@Valid Despesa despesa) {
        log.info("Objeto de despesa antes de persistir {}" + despesa);
        Despesa depesaEntity = despesaService.salvar(despesa);
        log.info("Objeto de despesa após persistir {}" + depesaEntity);

        ModelAndView model = new ModelAndView("/despesa/cadastro-de-despesa");
        model.addObject("mensagem", "Despesa salva com sucesso!");

        return model;
    }

    @ModelAttribute("todasCategoria")
    public List<Categorias> todasCategoria(){
        return categoriaService.getListAll();
    }

}
