package br.gov.sp.fatec.springboot3topicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3topicos.entity.Corpo;
import br.gov.sp.fatec.springboot3topicos.repository.CorpoRepository;

@Service
public class CorpoService{
    @Autowired
    private CorpoRepository corpoRepository;

    public List<Corpo> getAll(){
        return corpoRepository.findAll();
    }
    public Corpo insert(Corpo corpo) throws Exception{
        if(corpo.getNome() == null) throw new Exception("Nome não pode ser nulo.");
        if(corpo.getDescricao() == null) throw new Exception("Descrição não pode ser nulo.");
        if(corpo.getDistanciaEstrela() == null) throw new Exception("Distância não pode ser nulo.");

        return corpoRepository.save(corpo);
    }
    public List<Corpo> findByNameAndDistanciaGreaterThan(String nome, Float distancia){
        return corpoRepository.buscarPorNomeEDistancia(nome, distancia);
    }
}