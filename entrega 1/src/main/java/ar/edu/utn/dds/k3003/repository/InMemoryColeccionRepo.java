package ar.edu.utn.dds.k3003.repository;

import ar.edu.utn.dds.k3003.model.Coleccion;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryColeccionRepo implements ColeccionRepository {

  private List<Coleccion> colecciones;

  public InMemoryColeccionRepo(){
    this.colecciones = new ArrayList<>();
  }

  @Override
  public Optional<Coleccion> findById(String id) {
    return this.colecciones.stream().filter(x -> x.getNombre().equals(id)).findFirst();
  }

  @Override
  public Coleccion save(Coleccion col) {
    this.colecciones.add(col);
    col.setFechaModificacion(LocalDateTime.now());
    return col;
  }
}
