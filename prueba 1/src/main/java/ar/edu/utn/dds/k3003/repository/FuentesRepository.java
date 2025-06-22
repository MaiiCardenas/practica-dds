package ar.edu.utn.dds.k3003.repository;

import ar.edu.utn.dds.k3003.app.Fuente;
import ar.edu.utn.dds.k3003.app.Hecho;
import ar.edu.utn.dds.k3003.facades.dtos.ConsensosEnum;

import java.util.List;
import java.util.Optional;

public interface FuentesRepository {
    List<Hecho> findBy(ConsensosEnum consenso, String id);
    List<Hecho> findByTodos(String id);
    List<Hecho> findByRepetidos(String id);
    Fuente save(Fuente fuente);
}
