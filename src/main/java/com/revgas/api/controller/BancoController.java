package com.revgas.api.controller;

import com.revgas.api.model.Banco;
import com.revgas.api.repository.BancoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping({"/bancos"})
public class BancoController {
    private BancoRepository repository;

    BancoController(BancoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Banco> findAll(){
        return repository.findAll();
    }

    @GetMapping(path={"/{id}"})
    public ResponseEntity<Banco> findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
