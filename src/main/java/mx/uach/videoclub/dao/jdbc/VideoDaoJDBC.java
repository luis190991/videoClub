
package mx.uach.videoclub.dao.jdbc;

import java.util.List;
import mx.uach.videoclub.dao.VideoDao;
import mx.uach.videoclub.dao.enums.CRUD;
import mx.uach.videoclub.modelos.Director;

/**
 *
 * @author luis
 */
public class VideoDaoJDBC implements VideoDao{

    @Override
    public Director getDirectorById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Director> getDirectoresByCriteria(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void directorProcess(Director director, CRUD crud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
