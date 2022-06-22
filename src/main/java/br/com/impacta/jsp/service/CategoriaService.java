package br.com.impacta.jsp.service;

import br.com.impacta.jsp.model.Categorias;
import br.com.impacta.jsp.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<String> getList() {
        List<String> novaList = new ArrayList<>();

        categoriaRepository
                .findAll()
                .stream()
                .forEach(categorias ->
                        novaList.add(categorias.getNome())
                );

        return novaList;
    }

    public List<Categorias> getListAll(){
        return categoriaRepository.findAll();
    }
}
