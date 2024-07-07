package com.soccerCrud.service;

import java.util.List;

import com.soccerCrud.model.Futbolista;

public interface FutbolistaService {

    public List<Futbolista> listarFutbolistas();

    public Futbolista buscarFutbolista(Integer id);

}
