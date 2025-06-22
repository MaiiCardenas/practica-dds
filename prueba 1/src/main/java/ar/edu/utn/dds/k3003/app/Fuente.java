package ar.edu.utn.dds.k3003.app;

import java.util.List;

public class Fuente {
    private String id;
    private String nombre;
    public Fuente(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    private List<Hecho> hechos;
    private List<Coleccion> colecciones;
    public List<Hecho> getHechos() {return hechos;}
    public List<Coleccion> getColecciones() {return colecciones;}
    public void agregar(Hecho hecho){hechos.add(hecho);}
    public void agregar(Coleccion coleccion){colecciones.add(coleccion);}
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

}
