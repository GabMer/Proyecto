/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author OMEN
 */
public class Kardex {
    private int id;
    private String Producto;
    private String Marca;
    private Date fechaEntrada;
    private int entra;
    private Date fechaSalida;
    private int sale;
    private int saldo;

    public Kardex(int id, String Producto, String Marca, Date fechaEntrada, int entra, Date fechaSalida, int sale, int saldo) {
        this.id = id;
        this.Producto = Producto;
        this.Marca = Marca;
        this.fechaEntrada = fechaEntrada;
        this.entra = entra;
        this.fechaSalida = fechaSalida;
        this.sale = sale;
        this.saldo = saldo;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getEntra() {
        return entra;
    }

    public void setEntra(int entra) {
        this.entra = entra;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Kardex{" + "id=" + id + ", Producto=" + Producto + ", Marca=" + Marca + ", fechaEntrada=" + fechaEntrada + ", entra=" + entra + ", fechaSalida=" + fechaSalida + ", sale=" + sale + ", saldo=" + saldo + '}';
    }


    
    
}
