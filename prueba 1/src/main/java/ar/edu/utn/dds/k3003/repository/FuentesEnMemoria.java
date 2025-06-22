package ar.edu.utn.dds.k3003.repository;

import ar.edu.utn.dds.k3003.app.Fuente;
import ar.edu.utn.dds.k3003.app.Hecho;
import ar.edu.utn.dds.k3003.facades.dtos.ConsensosEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FuentesEnMemoria implements FuentesRepository{
    private List<Fuente> fuentes;

    public FuentesEnMemoria(){
        this.fuentes = new ArrayList<>();
    }
    @Override
    public List<Hecho> findBy(ConsensosEnum consenso, String s) {
        if (consenso.equals(ConsensosEnum.TODOS)) {
            return findByTodos(s);
        }
        if (consenso.equals(ConsensosEnum.AL_MENOS_2)) {
            return findByRepetidos(s);
        }else{
            return null;
        }
    }

    public List<Hecho> findByTodos(String id) {

        List<Hecho> hechos = new ArrayList<>();
            fuentes.stream().forEach(f->hechos.addAll(f.getHechos()));
            hechos.stream().filter(h->h.nombreColeccion().equals(id)).toList();
            int i = 0;
            while(i<hechos.stream().toList().size()){
                Hecho unHecho = hechos.get(i);
                hechos.stream().toList().remove(i);
                hechos.stream().toList().removeIf(h->unHecho.titulo().equals(h.titulo()));
                hechos.stream().toList().add(i, unHecho);
                i++;
        }
        return hechos;
    }

    @Override
    public List<Hecho> findByRepetidos(String id) {
        int cantFuentes = this.fuentes.size();
        if(cantFuentes<=1){ return this.fuentes.get(0).getHechos();}
        List<Hecho> hechosRep = new ArrayList<Hecho>();
        int i = 0;
        while(i < cantFuentes){
            //Fuente fuente = listaFuentes.get(i);
            List<Hecho> hechos = fuentes.get(i).getHechos();
            fuentes.remove(i);
            List<Hecho> restantes = new ArrayList<Hecho>();
            fuentes.stream().forEach(f-> restantes.addAll(f.getHechos()));
            int b = 0;
            while(b < hechos.size()){
                Hecho unHecho = hechos.get(b);
                if(hechosRep.stream().anyMatch(h->h.titulo().equals(unHecho.titulo()))){ b++;}else{
                    if(restantes.stream().anyMatch(h->h.titulo().equals(unHecho.titulo()))){
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
    @Override
    public Fuente save(Fuente fuente) {
        this.fuentes.add(fuente);
        return fuente;
    }
}

