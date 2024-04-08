package br.gov.sp.fatec.springboot3topicos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3topicos.entity.Trabalho;
import br.gov.sp.fatec.springboot3topicos.repository.TrabalhoRepository;

@Service
public class TrabalhoService{
    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public List<Trabalho> getAll(){
        return trabalhoRepository.findAll();
    }
    public Trabalho insert(Trabalho trabalho){
        return trabalhoRepository.save(trabalho);
    }
    public Optional<Trabalho> getById(Long id){
        return trabalhoRepository.findById(id);
    }
}