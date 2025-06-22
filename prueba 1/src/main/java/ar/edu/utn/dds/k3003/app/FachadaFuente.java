package ar.edu.utn.dds.k3003.app;

import ar.edu.utn.dds.k3003.facades.FachadaFuente;

import java.util.List;

public class FachadaFuente implements FachadaFuente {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hecho> getListaHechos() {
        return listaHechos;
    }

    public void setListaHechos(List<Hecho> listaHechos) {
        this.listaHechos = listaHechos;
    }

    private String nombre;
    private List<Hecho> listaHechos;

}
