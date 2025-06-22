package ar.edu.utn.dds.k3003.app;

import ar.edu.utn.dds.k3003.app.consenso.Consenso;
import ar.edu.utn.dds.k3003.facades.FachadaAgregador;
import ar.edu.utn.dds.k3003.facades.dtos.ConsensosEnum;
import ar.edu.utn.dds.k3003.facades.dtos.FuenteDTO;
import ar.edu.utn.dds.k3003.facades.dtos.HechoDTO;
import ar.edu.utn.dds.k3003.repository.FuentesEnMemoria;
import ar.edu.utn.dds.k3003.repository.FuentesRepository;
import lombok.val;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fachada implements FachadaAgregador {
    private FuentesRepository fuentesRepo;
    private ConsensosEnum consenso;

    public Fachada() {
        this.fuentesRepo = new FuentesEnMemoria();
    }
    @Override
    public List<HechoDTO> hechos(String colec) throws NoSuchElementException {
        List<Hecho> hechos = this.fuentesRepo.findBy(this.consenso, colec);
        if (hechos.isEmpty()) {
            throw new NoSuchElementException(colec + " no existe");}
            return hechos.stream().map(h -> new HechoDTO(h.id(), h.nombreColeccion(), h.titulo())).toList();
    }

    @Override
    public void addFachadaFuentes(String s, FachadaFuente fachadaFuente) {
        Fuente fuente = new Fuente(s, fachadaFuente.getNombre());
        this.fuentesRepo.save(fuente);
    }

    //@Override
    //public void setConsensoStrategy(ConsensosEnum consensosEnum, String s) throws InvalidParameterException;

    @Override
    public FuenteDTO agregar(FuenteDTO fuenteDTO) {
        return null;
    }

    @Override
    public List<FuenteDTO> fuentes(){
            return null;
    }

    @Override
    public FuenteDTO buscarFuenteXId(String s) throws NoSuchElementException {
        return null;
    }
}
}