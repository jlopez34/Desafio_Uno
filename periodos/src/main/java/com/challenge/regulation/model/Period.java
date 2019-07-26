package com.challenge.regulation.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Period implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;
    private LocalDate fechaCreacion;
    private LocalDate fechaFin;
    private List<LocalDate> fechas;
    private List<LocalDate> fechasFaltantes;

    public Period() {

    }

    public Period(Long id, LocalDate fechaCreacion, LocalDate fechaFin, List<LocalDate> fechas, List<LocalDate> fechasFaltantes) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.fechaFin = fechaFin;
        this.fechas = fechas;
        this.fechasFaltantes = fechasFaltantes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<LocalDate> getFechas() {
        return fechas;
    }

    public void setFechas(List<LocalDate> fechas) {
        this.fechas = fechas;
    }

    public List<LocalDate> getFechasFaltantes() {
        return fechasFaltantes;
    }

    public void setFechasFaltantes(List<LocalDate> fechasFaltantes) {
        this.fechasFaltantes = fechasFaltantes;
    }

    @Override
    public String toString() {
        return "Period{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaFin=" + fechaFin +
                ", fechas=" + fechas +
                ", fechasFaltantes=" + fechasFaltantes +
                '}';
    }
}
