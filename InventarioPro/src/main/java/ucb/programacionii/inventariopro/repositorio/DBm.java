/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.programacionii.inventariopro.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OMEN
 */
public class DBm {
    private static Connection conne = null;
    public static Connection getConnection() throws SQLException {
     if (conne == null) {
            String url = "jdbc:postgresql://localhost:5432/ucb_almacen";
            conne = DriverManager.getConnection(url, "ucb", "Tarija00");
        }

        return conne;
    }
}
