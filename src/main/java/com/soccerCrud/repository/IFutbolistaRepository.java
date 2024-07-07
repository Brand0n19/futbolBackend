package com.soccerCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soccerCrud.model.Futbolista;

@Repository
public interface IFutbolistaRepository extends JpaRepository<Futbolista, Integer> {

}
