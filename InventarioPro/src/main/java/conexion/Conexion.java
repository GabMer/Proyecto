package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection conectar() {

        try {
            //jdbc:postgresql://localhost:5432/ucb_almacen
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PROYECTO", "postgres", "adriana123");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local: " + e);
        }
        return null;

    }
}
