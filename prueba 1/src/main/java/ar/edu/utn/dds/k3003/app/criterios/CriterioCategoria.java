package ar.edu.utn.dds.k3003.app.criterios;

import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.List;

public class CriterioCategoria implements Criterio{
    public String categoria;

    public CriterioCategoria(String categoria) {
        this.categoria = categoria;
    }
    @Override
    public void discriminar(List<Hecho> hechos){

    }
}
