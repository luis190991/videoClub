/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.videoclub.controllers;
import java.util.List;
import mx.uach.videoclub.dao.VideoDao;
import mx.uach.videoclub.dao.jdbc.VideoDaoJDBC;
import mx.uach.videoclub.modelos.Director;
import static spark.Spark.*;


/**
 *
 * @author luis
 */
public class Application {
    
    public static void main(String[] args) {
        get("/", (req, res)->{
            VideoDao dao = new VideoDaoJDBC();
            String respuesta = "";

            List<Director> directores = dao.getDirectoresByCriteria("");
            for (Director director : directores) {
                respuesta = String.format("%s <br> %s - %s",respuesta,
                        director.getId(), 
                        director.getNombre());
            }
            
            
            return respuesta;
        });
        
    }
    
}
