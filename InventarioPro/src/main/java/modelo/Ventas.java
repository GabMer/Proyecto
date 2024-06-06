/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author OMEN
 */
public class Ventas {
    int id;
    int idUsuario;
    String Modelo;
    String Descripcion;
    String Fecha;
    double Monto;
    String Estado;
    
    public Ventas(){
        
    }

    public Ventas(int id, int idUsuario, String Modelo,String Descripcion, String Fecha, double Monto, String Estado) {
        this.id = 0;
        this.idUsuario = 0;
        this.Modelo = Modelo;
        this.Descripcion=Descripcion;
        this.Fecha = Fecha;
        this.Monto = 0.0;
        this.Estado = Estado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Ventas{" + "id=" + id + ", idUsuario=" + idUsuario + ", Modelo=" + Modelo + ", Descripcion=" + Descripcion + ", Fecha=" + Fecha + ", Monto=" + Monto + ", Estado=" + Estado + '}';
    }

    
  
    
}
