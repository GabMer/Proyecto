/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.programacionii.inventariopro.dominio;

/**
 *
 * @author OMEN
 */
public class Marca {
    private final int id;
    private String nombre;
    
    public Marca(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Marca() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Métodos getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
