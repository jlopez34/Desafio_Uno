package com.challenge.regulation.repository.entity;

import java.io.Serializable;
import java.util.List;

public class Regulation implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;
    private String fechaCreacion;
    private String fechaFin;
    private List<String> fechas;

    public Regulation() {

    }

    public Regulation(Long id, String fechaCreacion, String fechaFin, List<String> fechas) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFin = fechaFin;
        this.fechas = fechas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getFechas() {
        return fechas;
    }

    public void setFechas(List<String> fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        return "Regulation{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaFin=" + fechaFin +
                ", fechas=" + fechas +
                '}';
    }
}
