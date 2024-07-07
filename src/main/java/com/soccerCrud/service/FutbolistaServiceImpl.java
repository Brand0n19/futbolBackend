package com.soccerCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soccerCrud.model.Futbolista;
import com.soccerCrud.repository.IFutbolistaRepository;

@Service
public class FutbolistaServiceImpl implements FutbolistaService {

    @Autowired IFutbolistaRepository repoFutb;

    @Override
    public List<Futbolista> listarFutbolistas() {
        return repoFutb.findAll();
    }

    @Override
    public Futbolista buscarFutbolista(Integer id) {
        return repoFutb.findById(id).get();
    }

}
