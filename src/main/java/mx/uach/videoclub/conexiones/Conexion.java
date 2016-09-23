package mx.uach.videoclub.conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Antonio Ramirez Martinez
 */
public class Conexion {

    private final static String USUARIO = "postgres";
    private final static String PASSWORD = "abcd1234";
    private final static String CONEXION = "jdbc:postgresql://localhost:5432/zoo";
    private static Conexion INSTANCE;
    private Connection con;

    private Conexion() {
        this.initConection();
    }

    private void initConection() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(CONEXION, USUARIO, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Conexion getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conexion();
        }
        return INSTANCE;
    }

    public Connection getCon() {
        return con;
    }

}
