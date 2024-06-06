/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author OMEN
 */
public class DetalleVentas {

    int id;
    int idVentas;
    int idProductos;
    String DescripcionA;
    int cantidad;
    double preVenta;  //precioVenta 
    double subtotal;
    double descuento;
    double iva;
    double it;
    double total;
    int estado;

    public DetalleVentas() {
        this.id = 0;
        this.idVentas = 0;
        this.idProductos = 0;
        this.DescripcionA = DescripcionA;
        this.cantidad = 0;
        this.preVenta = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.iva = 0.0;
        this.total = 0.0;
        this.estado = 0;
    }

    public DetalleVentas(int id, int idVentas, int idProductos, String DescripcionA, int cantidad, double preVenta, double subtotal, double descuento, double iva, double total, int estado) {
        this.id = id;
        this.idVentas = idVentas;
        this.idProductos = idProductos;
        this.DescripcionA = DescripcionA;
        this.cantidad = cantidad;
        this.preVenta = preVenta;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.total = total;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(int idProductos) {
        this.idProductos = idProductos;
    }

    public String getDescripcionA() {
        return DescripcionA;
    }

    public void setDescripcionA(String DescripcionA) {
        this.DescripcionA = DescripcionA;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getIt() {
        return it;
    }

    public void setIt(double it) {
        this.it = it;
    }
    
  
    @Override
    public String toString() {
        return "DetalleVentas{" + "id=" + id + ", idVentas=" + idVentas + ", idProductos=" + idProductos + ", DescripcionA=" + DescripcionA + ", cantidad=" + cantidad + ", preVenta=" + preVenta + ", subtotal=" + subtotal + ", descuento=" + descuento + ", iva=" + iva + ", total=" + total + ", estado=" + estado + '}';
    }

    

    

}
