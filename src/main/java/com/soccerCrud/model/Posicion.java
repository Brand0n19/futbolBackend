package com.soccerCrud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="tb_posicion")
public class Posicion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name="id_posicion")
    private int id_posicion;

    @Column(name="descripcion")
    private String descripcion;

}
