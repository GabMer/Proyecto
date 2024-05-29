package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP VICTUS
 */
public class Ctrl_Marca {
    
    public boolean eliminar (int ID){
        boolean respuesta= false;
        Connection cn= Conexion.conectar();
        
        try{
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM public.\"MARCAS\" WHERE ID ='" + ID + "'");
            consulta.executeUpdate();
            
            if (consulta.executeUpdate() > 0){
                respuesta= true;
            }
            cn.close();
        }catch (SQLException e ){
            System.out.println("error al eliminar categoria" + e);
        }
        
        return respuesta;
    }
    
    
    
}
