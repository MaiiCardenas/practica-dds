package ar.edu.utn.dds.k3003.app.consenso;

import ar.edu.utn.dds.k3003.app.Fuente;
import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.List;

public interface Consenso {
    public List<Hecho> validar(List<Fuente> listaFuentes);
}
