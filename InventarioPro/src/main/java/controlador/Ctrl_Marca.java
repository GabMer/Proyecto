package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author OMEN
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

    public boolean modificar(String marcaActual, String nuevaMarca) {
        
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE public.\"MARCAS\" SET \"MARCA\" = ? WHERE \"MARCA\" = ?");
            consulta.setString(1, nuevaMarca); // Establecer el nuevo valor para la marca
            consulta.setString(2, marcaActual);
 

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al modificar marca: " + e);
        }

        return respuesta;
        
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean insertar(String MARCA) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO public.\"MARCAS\" ( \"MARCA\") VALUES ( ?)");
            consulta.setString(1, MARCA);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar categoría: " + e);
        }

        return respuesta;


//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
