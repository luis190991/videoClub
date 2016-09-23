package mx.uach.videoclub.modelos;

import mx.uach.videoclub.modelos.genericos.Model;

/**
 * Modelo para mappear los directores de las Peliculas del VideoClub
 *
 * @author Luis Antonio Ramirez Martinez
 * @version 1.0
 *
 */
public class Director extends Model {

    public static final String TABLA = "Director";

    public static final String[] FIELDS = {"id", "nombre"};

    public static final String Q = String.format("SELECT %s FROM %s",
            fieldsToQuery(FIELDS), TABLA);

    private String nombre;

    public Director() {
    }

    public Director(String nombre) {
        this.nombre = nombre;
    }

    public Director(Integer id, String nombre) {
        this(nombre);
        this.setId(id);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
