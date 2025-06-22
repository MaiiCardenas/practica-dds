package ar.edu.utn.dds.k3003.app.consenso;
import ar.edu.utn.dds.k3003.app.Fuente;
import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.ArrayList;
import java.util.List;

public class ConsensoTodos implements Consenso{
    @Override
    public List<Hecho> validar(List<Fuente> listaFuentes){

        List<Hecho> hechos = new ArrayList<Hecho>();
        listaFuentes.stream().forEach(f->hechos.addAll(f.getHechos()));
        return hechos;
    }

}
