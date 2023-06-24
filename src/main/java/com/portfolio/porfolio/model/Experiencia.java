/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.porfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Carlos
 */
@Getter @Setter 
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String empresa;
    private Boolean trabajoActual;
    private String fechainicio;
    private String fechaFin;
    private String puesto;
    
    @Column(length = 500)
    private String descripcion;
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    @JsonBackReference(value="personaReference")
    private Persona persona;
    */
    @ManyToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference
    private Persona persona;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id2")
    @JsonBackReference
    private Persona persona;
    
    //ahora declaramos la relacion con jobs
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipos_id")
    @JsonBackReference
    private Tipos tipos;*/
    
    
    
    
    
}