package mx.uach.videoclub.modelos.genericos;

/**
 * Modelo general de todo el sistema.
 *
 * @author Luis Antonio Ramirez Martinez
 * @version 1.0
 *
 */
public class Model {
    
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

}
