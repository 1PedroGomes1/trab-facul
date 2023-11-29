package com.example.PedroHGomes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.PedroHGomes.domains.Cadastro;  // Alterado de Turma para Cadastro
import com.example.PedroHGomes.repositorio.*;

@Controller
@RequestMapping("/cadastro")  // Alterado de "/turma" para "/cadastro"
public class CadastroController {  // Alterado de TurmaController para CadastroController

    @Autowired
    private CadastroRepository cadastroRepository;  // Alterado de TurmaRepository para CadastroRepository

    @GetMapping("/lista")
    public ModelAndView listaCadastro(Cadastro cadastro) {  // Alterado de Turma para Cadastro
        ModelAndView modelAndView = new ModelAndView("lista");
        List<Cadastro> cadastros = cadastroRepository.findAll();
        modelAndView.addObject("cadastros", cadastros);
        return modelAndView;
    }

    @GetMapping
    public String mostraForm(Cadastro cadastro) {  // Alterado de Turma para Cadastro
        return "add-Cadastro";
    }

    @PostMapping
    public ModelAndView addCadastro(@ModelAttribute Cadastro cadastro) {  // Alterado de Turma para Cadastro

        cadastroRepository.save(cadastro);

        ModelAndView modelAndView = new ModelAndView("add-Cadastro");
        modelAndView.addObject("mensagem", "Salvo com Sucesso");

        return modelAndView;
    }

    @PostMapping("/remove/{id}")
    public ModelAndView removeCadastro(@PathVariable("id") Long id) {
        cadastroRepository.deleteById(id);

        ModelAndView modelAndView = new ModelAndView("redirect:/cadastro/lista");
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView mostraCadastro(@PathVariable("id") Long id) {
        Cadastro cadastro = cadastroRepository.findById(id).orElse(null);
        ModelAndView modelAndView = new ModelAndView("cadastro");
        modelAndView.addObject("cadastro", cadastro);
        return modelAndView;
    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
