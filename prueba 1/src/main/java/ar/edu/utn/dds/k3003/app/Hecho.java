package ar.edu.utn.dds.k3003.app;
import java.time.LocalDateTime;
import java.util.List;

public class Hecho {
    private String id;
    private String nombreColeccion;
    private final String titulo;
    private List<String> etiquetas;
    private CategoriaHechoEnum categoria;
    private final String ubicacion;
    private final LocalDateTime fecha;
    private final String origen;

    private final LocalDateTime fechaCarga = LocalDateTime.now() ;

    public Hecho(String id, String nombreColeccion, String titulo) {
        this(id, nombreColeccion, titulo, (List)null, (CategoriaHechoEnum)null, (String)null, (LocalDateTime)null, (String)null);
    }


    public Hecho(String id, String nombreColeccion, String titulo, List<String> etiquetas, CategoriaHechoEnum categoria, String ubicacion, LocalDateTime fecha, String origen) {
        this.id = id;
        this.nombreColeccion = nombreColeccion;
        this.titulo = titulo;
        this.etiquetas = etiquetas;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.origen = origen;
    }

    public String id() {
        return this.id;
    }

    public String nombreColeccion() {
        return this.nombreColeccion;
    }

    public String titulo() {
        return this.titulo;
    }

    public List<String> etiquetas() {
        return this.etiquetas;
    }

    public CategoriaHechoEnum categoria() {
        return this.categoria;
    }

    public String ubicacion() {
        return this.ubicacion;
    }

    public LocalDateTime fecha() {
        return this.fecha;
    }

    public String origen() {
        return this.origen;
    }
}

