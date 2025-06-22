package ar.edu.utn.dds.k3003.app.criterios;

import ar.edu.utn.dds.k3003.app.Hecho;

import java.time.LocalDateTime;
import java.util.List;

public class CriterioFechaAcontecimiento implements Criterio{
    private LocalDateTime desde;
    private LocalDateTime hasta;

    public CriterioFechaAcontecimiento(LocalDateTime desde, LocalDateTime hasta) {
        this.desde = desde;
        this.hasta = hasta;
    }

    @Override
    public void discriminar(List<Hecho> hechos){

    }
}

