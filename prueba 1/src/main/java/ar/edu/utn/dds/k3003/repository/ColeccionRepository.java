package ar.edu.utn.dds.k3003.repository;

import ar.edu.utn.dds.k3003.app.Coleccion;
import java.util.Optional;

public interface ColeccionRepository {

    Optional<Coleccion> findById(String id);
    Coleccion save(Coleccion col);

}