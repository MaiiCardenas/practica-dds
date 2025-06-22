package ar.edu.utn.dds.k3003.app.criterios;

import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.List;

public class CriterioLugar implements Criterio{
    private String lugar;

    public CriterioLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public void discriminar(List<Hecho> hechos){

    }
}
