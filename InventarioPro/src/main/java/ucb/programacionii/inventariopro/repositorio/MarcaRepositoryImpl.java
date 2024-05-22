/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.programacionii.inventariopro.repositorio;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ucb.programacionii.inventariopro.dominio.Marca;

/**
 *
 * @author OMEN
 */
public class MarcaRepositoryImpl {
    public boolean store(Marca marca) {
    String sql = "INSERT INTO marca (id, nombre) "
               + "VALUES (?, ?) "
               + "ON DUPLICATE KEY UPDATE "
               + "nombre = VALUES(nombre)";
    try (PreparedStatement stm = DBm.getConnection().prepareStatement(sql)) {
        stm.setInt(1, marca.getId());
        stm.setString(2, marca.getNombre());
        
        return stm.executeUpdate() > 0;
    } catch (SQLException ex) {
        Logger.getLogger(MarcaRepositoryImpl.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return false;
}

}
