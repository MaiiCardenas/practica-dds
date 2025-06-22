package ar.edu.utn.dds.k3003.app.consenso;

import ar.edu.utn.dds.k3003.app.Fuente;
import ar.edu.utn.dds.k3003.app.Hecho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsensoRepetidos implements Consenso{
    private int cantFuentes;
    public ConsensoRepetidos(int cantFuentes) {
        this.cantFuentes = cantFuentes;
    }
    @Override
    public List<Hecho> validar(List<Fuente> listaFuentes){
        if(cantFuentes==1){ return listaFuentes.get(0).getHechos();}
        List<Hecho> hechosRep = new ArrayList<Hecho>();
        int i = 0;
        while(i < cantFuentes){
            //Fuente fuente = listaFuentes.get(i);
            List<Hecho> hechos = listaFuentes.get(i).getHechos();
            listaFuentes.remove(i);
            List<Hecho> restantes = new ArrayList<Hecho>();
            listaFuentes.stream().forEach(f-> restantes.addAll(f.getHechos()));
            int b = 0;
            while(b < hechos.size()){
                Hecho unHecho = hechos.get(b);
                if(hechosRep.stream().anyMatch(h->h.id().equals(unHecho.id()))){ b++;}else{
                if(restantes.stream().anyMatch(h->h.id().equals(unHecho.id()))){
                        hechosRep.add(unHecho);
                        b++;
                    }
                }
                b++;
            }
            i++;
        }
        return hechosRep;
    }

}
