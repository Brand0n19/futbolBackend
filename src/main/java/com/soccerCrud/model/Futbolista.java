package com.soccerCrud.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_futbolistas")
@Data
public class Futbolista {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "caracteristicas")
    private String caracteristicas;

    @Column(name = "fecha_de_nacimiento")
    private LocalDate fecha_nac;

    @Column(name = "id_posicion")
    private int id_posicion;


    @ManyToOne
    @JoinColumn(name = "id_posicion", insertable = false, updatable = false)
    private Posicion objPosicion;

}
