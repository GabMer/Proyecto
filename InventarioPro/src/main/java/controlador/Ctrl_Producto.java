package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP VICTUS
 */
public class Ctrl_Producto {
    public boolean insertar(int marcaID, int marca, String paisOrigen, String descripcion1, String descripcion2,
                        int talla, int cantidad, String color, String categoria, String genero,
                        String tipo, double precioCompra, double precioVenta,
                        int ubicacionAlmacen, int ubicacionArmazon) {
    boolean respuesta = false;
    Connection cn = Conexion.conectar();

    try {
        String sql = "INSERT INTO public.\"PRODUCTOS\" (\"MARCA_ID\", \"MARCA\", \"PAIS_DE_ORIGEN\", \"DESCRIPCION_A\", \"DESCRIPCION_B\", " +
                     "\"TALLA\", \"CANTIDAD\", \"COLOR\", \"CATEGORIA\", \"GENERO\", \"TIPO\", " +
                     "\"PRECIO_DE_COMPRA\", \"PRECIO_DE_VENTA\", \"UBICACION_DE_ALMACEN\", " +
                     "\"UBICACION_DE_ARMAZON\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement consulta = cn.prepareStatement(sql);

        consulta.setInt(1, marcaID);
        consulta.setInt(2, marca);
        consulta.setString(3, paisOrigen);
        consulta.setString(4, descripcion1);
        consulta.setString(5, descripcion2);
        consulta.setInt(6, talla);
        consulta.setInt(7, cantidad);
        consulta.setString(8, color);
        consulta.setString(9, categoria);
        consulta.setString(10, genero);
        consulta.setString(11, tipo);
        consulta.setDouble(12, precioCompra);
        consulta.setDouble(13, precioVenta);
        consulta.setInt(14, ubicacionAlmacen);
        consulta.setInt(15, ubicacionArmazon);

        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar marca: " + e);
        }

        return respuesta;
}
}
