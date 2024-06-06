/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author OMEN
 */
public class Producto {
    int Marca_ID;
    int id;
    String PaOrigen;
    String DescA;
    String DescB;
    int talla;
    int cantidad;
    String Color;
    String Categoria;
    String genero;
    String Tipo;
    double preCompra;
    double preVenta;
    int ubiAlmacen;
    int ubiArmazon;
    
    public Producto(){
        
    }

    public Producto(int Marca_ID, int id, String Pa_origen, String DescA, String DescB, int talla, int cantidad, String Color, String Categoria, String genero, String Tipo, double preCompra, double preVenta, int ubiAlmacen, int ubiArmazon) {
        this.Marca_ID = Marca_ID;
        this.id = id;
        this.PaOrigen = PaOrigen;
        this.DescA = DescA;
        this.DescB = DescB;
        this.talla = talla;
        this.cantidad = cantidad;
        this.Color = Color;
        this.Categoria = Categoria;
        this.genero = genero;
        this.Tipo = Tipo;
        this.preCompra = preCompra;
        this.preVenta = preVenta;
        this.ubiAlmacen = ubiAlmacen;
        this.ubiArmazon = ubiArmazon;
    }

    public int getMarca_ID() {
        return Marca_ID;
    }

    public void setMarca_ID(int Marca_ID) {
        this.Marca_ID = Marca_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaOrigen() {
        return PaOrigen;
    }

    public void setPaOrigen(String PaOrigen) {
        this.PaOrigen = PaOrigen;
    }

    public String getDescA() {
        return DescA;
    }

    public void setDescA(String DescA) {
        this.DescA = DescA;
    }

    public String getDescB() {
        return DescB;
    }

    public void setDescB(String DescB) {
        this.DescB = DescB;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getPreCompra() {
        return preCompra;
    }

    public void setPreCompra(double preCompra) {
        this.preCompra = preCompra;
    }

    public double getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(double preVenta) {
        this.preVenta = preVenta;
    }

    public int getUbiAlmacen() {
        return ubiAlmacen;
    }

    public void setUbiAlmacen(int ubiAlmacen) {
        this.ubiAlmacen = ubiAlmacen;
    }

    public int getUbiArmazon() {
        return ubiArmazon;
    }

    public void setUbiArmazon(int ubiArmazon) {
        this.ubiArmazon = ubiArmazon;
    }


    
    
    
}
