package mx.uach.videoclub.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uach.videoclub.conexiones.Conexion;
import mx.uach.videoclub.dao.VideoDao;
import mx.uach.videoclub.dao.enums.CRUD;
import mx.uach.videoclub.modelos.Director;

/**
 *
 * @author luis
 */
public class VideoDaoJDBC implements VideoDao {

    @Override
    public Director getDirectorById(Integer id) {
        try {
            ResultSet rs;
            Statement st = Conexion.getInstance().getCon().createStatement();
            rs = st.executeQuery(String.format("%s %s %s ", Director.Q,
                    Director.Q_WHRE_ID, id));
            
        } catch (SQLException ex) {

        }
        return null;
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
