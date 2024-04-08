package br.gov.sp.fatec.springboot3topicos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3topicos.entity.Trabalho;
import br.gov.sp.fatec.springboot3topicos.service.TrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin
public class TrabalhoController{

    @Autowired
    private TrabalhoService service;

    @GetMapping
    public List<Trabalho> getAll(){
        return service.getAll();
    }
    @PostMapping
    public Trabalho insert(@RequestBody Trabalho data){
        return service.insert(data);
    }
    @GetMapping(value = "/{id}")
    public Optional<Trabalho> getById(@PathVariable("id") Long id){
        return service.getById(id);
    }
}