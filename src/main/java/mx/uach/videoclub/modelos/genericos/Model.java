package mx.uach.videoclub.modelos.genericos;

import java.util.Arrays;
import java.util.List;

/**
 * Modelo general de todo el sistema.
 *
 * @author Luis Antonio Ramirez Martinez
 * @version 1.0
 *
 */
public class Model {
    
    public static final String Q_WHRE_ID = "WHERE id = ";
    
    public static final String Q_WHRE = "";

    private Integer id;

    public Model() {
    }

    public Model(Integer id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Convierte de un arreglo de campos a un String para un query.
     *
     * @param fields son los atributos de la tabla.
     * @return attr1, attr2, ... attrn
     */
    public static String fieldsToQuery(String[] fields) {
        String campos = "";
        List<String> fieldsList = Arrays.asList(fields);
        for (String field : fieldsList) {
            campos = String.format("%s, %s", campos, field);
        }
        return campos.substring(1);
    }

}
