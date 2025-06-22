package ar.edu.utn.dds.k3003.app.criterios;

import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.List;

public interface Criterio {
    void discriminar(List<Hecho> hechos);
}
