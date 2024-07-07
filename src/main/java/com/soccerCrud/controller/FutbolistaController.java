package com.soccerCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soccerCrud.model.Futbolista;
import com.soccerCrud.service.FutbolistaService;

@RestController
@RequestMapping("/api/futbolistas")
public class FutbolistaController {

    @Autowired
    private FutbolistaService service;

    @GetMapping("/")
    public ResponseEntity<List<Futbolista>> listarFutbolistas(){
        return ResponseEntity.ok(service.listarFutbolistas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Futbolista> buscarFutbolista(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarFutbolista(id));
    }

}
