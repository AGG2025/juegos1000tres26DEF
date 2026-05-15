package com.juegos1000tres.juegos1000tres_backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "juegos_entities")
public class JuegoEntities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int numeroJugadores;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String ruta;

    public JuegoEntities() {
    }

    public JuegoEntities(int numeroJugadores, String nombre, String descripcion, String ruta) {
        this.numeroJugadores = numeroJugadores;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }

    public Long getId() {
        return id;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
