package ar.edu.utn.dds.k3003.app;

import ar.edu.utn.dds.k3003.app.consenso.enumConsenso;

import java.util.ArrayList;
import java.util.List;

public class Agregador {
    private List<Fuente> fuentes;
    private enumConsenso tipoEnumConsenso;

    public Agregador(List<Fuente> algunasFuentes, enumConsenso unEnumConsenso) {
        this.fuentes = algunasFuentes;
        this.tipoEnumConsenso = unEnumConsenso;
    }

    public List<Hecho> hechos(Coleccion unaColeccion) {
        List<Hecho> hechos = new ArrayList<Hecho>();
        fuentes.stream().forEach(f->hechos.addAll(f.getHechos()));
        hechos.stream().filter(h->h.nombreColeccion().equals(unaColeccion.getTitulo())).toList();
        int i = 0;
        while(i<hechos.size()){
            Hecho unHecho = hechos.get(i);
            hechos.remove(i);
            hechos.removeIf(h->unHecho.id().equals(h.id()));
            hechos.add(i, unHecho);
            i++;
            }
        return hechos;
    }

    public List<Fuente> getFuentes() {
        return fuentes;
    }

    public enumConsenso getTipoConsenso() {
        return tipoEnumConsenso;
    }
    public void setFuentes(List<Fuente> fuentes) {
        this.fuentes = fuentes;
    }

    public void setTipoConsenso(enumConsenso tipoEnumConsenso) {
        this.tipoEnumConsenso = tipoEnumConsenso;
    }
}
