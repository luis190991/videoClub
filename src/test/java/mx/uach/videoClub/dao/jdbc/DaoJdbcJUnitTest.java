package mx.uach.videoClub.dao.jdbc;

import java.util.List;
import mx.uach.videoclub.dao.VideoDao;
import mx.uach.videoclub.dao.jdbc.VideoDaoJDBC;
import mx.uach.videoclub.modelos.Director;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas del Dao JDBC
 *
 * @author Luis Antonio Ramirez
 */
public class DaoJdbcJUnitTest {

    public DaoJdbcJUnitTest() {
        
    }
    
    @Test
    public void directorByIdTest(){
        VideoDao dao = new VideoDaoJDBC();
        
        // Id = 1 James Cameron
        Director d = dao.getDirectorById(1);
        
        assertNotNull(d);
        assertEquals(d.getNombre(), "James Cameron");
        
        assertNotEquals(d.getNombre(), "Alfonso Cuaron");
        
        //Id = 2 Alfonso Cuaron
        Director d2 = dao.getDirectorById(2);
        
        assertNotNull(d2);
        assertEquals(d2.getNombre(), "Alfonso Cuaron");
        
        assertNotEquals(d2.getNombre(), "James Cameron");
        
        
        List<Director> directores = dao.getDirectoresByCriteria("");
        assertEquals(3, directores.size());
        
    }

}
