package mx.uach.videoclub.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public VideoDaoJDBC() {
    }
    
    

    @Override
    public Director getDirectorById(Integer id) {
        try {
            ResultSet rs;
            Statement st = Conexion.getInstance().getCon().createStatement();
            rs = st.executeQuery(String.format("%s %s %s ", Director.Q,
                    Director.Q_WHRE_ID, id));
            Director obj = null;
            while (rs.next()) {
                obj = new Director(rs.getInt(Director.FIELDS[0]),
                        rs.getString(Director.FIELDS[1]));
            }
            return obj;
        } catch (SQLException ex) {

        }
        return null;
    }

    @Override
    public List<Director> getDirectoresByCriteria(String criterio) {
        List<Director> objects  = new ArrayList<>();
        try {
            ResultSet rs;
            Statement st = Conexion.getInstance().getCon().createStatement();
            rs = st.executeQuery(String.format("%s %s %s ", Director.Q, 
                    Director.Q_WHRE, criterio));
            Director obj = null;
            while (rs.next()) {
                obj = new Director(rs.getInt(Director.FIELDS[0]),
                        rs.getString(Director.FIELDS[1]));
                objects.add(obj);
            }
            
        } catch (SQLException ex) {

        }
        return objects;
    }

    @Override
    public void directorProcess(Director director, CRUD crud) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
